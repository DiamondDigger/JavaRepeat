package alexei.anatsky.ITMO_konspect.ReflectionPackage;

import java.lang.reflect.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        SimpleClass human = new SimpleClass();
        human.setAge(25);

        System.out.println("human.age: " + human.age);
        System.out.println("human.getHealth(): " + human.getStamina());

        human.boost(5);
        human.run();
        human.walk();
        human.sit();
        System.out.println("Result stamina: " + human.getStamina());

        Class linkToSimpleClass = human.getClass();

        //getFields
        //getDeclaredFields
        System.out.println("linkToSimpleClass.getCanonicalName(): " + linkToSimpleClass.getName());
        System.out.println("linkToSimpleClass.getCanonicalName(): " + linkToSimpleClass.getCanonicalName());
        System.out.println("linkToSimpleClass.isInterface(): " + linkToSimpleClass.isInterface());
        System.out.println("******************");
        Field[] publicFields = linkToSimpleClass.getFields();
        int i = 0;
        for (Field publicField : publicFields) {
            i++;
            System.out.println("public field #" + i + ": " + publicField);
        }

        System.out.println("******************");
        Field[] fields = linkToSimpleClass.getDeclaredFields();
        i = 0;
        for (Field field : fields) {
            i++;
            System.out.println("field #" + i + ": " + field);
        }
        System.out.println("******************");

        Class<?> classClass = SimpleClass.class;
        System.out.println("classClass.getSimpleName(): " + classClass.getSimpleName());

        //getModifiers
        //getSuperclass
        //isPublic
        int classModifier = classClass.getModifiers();
        int privateFieldModifier = fields[0].getModifiers();
        System.out.println("class modifier int value: " + classModifier);
        System.out.println("field private modifier int value: " + privateFieldModifier);
        System.out.println("class modifier is public: " + Modifier.isPublic(classModifier));
        System.out.println("linkToSimpleClass.getSuperclass(): " + linkToSimpleClass.getSuperclass().getSimpleName());
        System.out.println("linkToSimpleClass.getInterfaces(): " + Arrays.toString(linkToSimpleClass.getInterfaces()));

        //forName
        //getConstructor
        //getField
        //getMethod
        //invoke
        //newInstance
        //setAccessible
        try {
            System.out.println("classClass.getConstructor(): " + classClass.getConstructor());
            System.out.println("*****************");
            System.out.println("Reflection in work...");

            Class<?> c = Class.forName("alexei.anatsky.ITMO_konspect.ReflectionPackage.SimpleClass");
            Constructor<?> constructor = c.getConstructor();
            Object object = constructor.newInstance();
            SimpleClass s = (SimpleClass) object;
            s.boost(15);
            
            Field fieldStamina = c.getDeclaredField("stamina");
            fieldStamina.setAccessible(true);
            fieldStamina.set(s, 1);
            System.out.println("fieldStamina.get(s): " + fieldStamina.get(s));
            Method methodBoost = c.getMethod("boost", int.class);
            methodBoost.invoke(s, 25);
            System.out.println("s.getAge(): " + s.getAge());
        } catch (NoSuchMethodException | SecurityException exc) {
            exc.printStackTrace();
            System.out.println("No such constructor");
        } catch (ClassNotFoundException exc) {
            System.out.println("No such class");
        } catch (InvocationTargetException e) {
            System.out.println("Problems with constructor invocation");
        } catch (NoSuchFieldException e) {
            System.out.println("Can't find such type of field");
        }

    }
}
