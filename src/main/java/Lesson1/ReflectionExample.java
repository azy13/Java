package Lesson1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        User user = new User("Sewa", "Ivashkevich");

        Class userClass = user.getClass();


        Field nameField = userClass.getDeclaredField("name");
        nameField.setAccessible(true);
        System.out.println("Before = " + user.getName());
        nameField.set(user, "Kirill");
        System.out.println("After = " + user.getName());

        Method method = userClass.getDeclaredMethod("concatStrings");
        method.setAccessible(true);
        String s = (String) method.invoke(user);
        System.out.println(s.toString() );



    }

}
