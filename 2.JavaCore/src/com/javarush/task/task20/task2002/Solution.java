package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
Читаем и пишем в файл: JavaRush
*/

public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        String your_file_name = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test1.txt";
        try {
            File yourFile = File.createTempFile(your_file_name, null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user1 = new User();
            user1.setFirstName("Aleksei");
            user1.setLastName("Antsyferov");

            SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            String dateInString = "30-Sep-1986";
            Date date = formatter.parse(dateInString);

            user1.setBirthDate(date);
            user1.setCountry(User.Country.UKRAINE);
            user1.setMale(true);
            javaRush.users.add(user1);
            User user2 = new User();
            user2.setFirstName("Aleksei1");
            user2.setLastName("Antsyferov1");
            user2.setBirthDate(date);
            user2.setCountry(User.Country.UKRAINE);
            user2.setMale(true);
            javaRush.users.add(user2);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            User user11 = loadedObject.users.get(0);
            User user22 = loadedObject.users.get(1);
            System.out.println(user1.equals(user11));
            System.out.println(user2.equals(user22));
            System.out.println(user1.equals(user22));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            for (User user : users) {
                outputStream.write(user.getFirstName().getBytes());
                outputStream.write(" ".getBytes());
                outputStream.write(user.getLastName().getBytes());
                outputStream.write(" ".getBytes());
                outputStream.write(String.valueOf(user.getBirthDate().getTime()).getBytes());
                outputStream.write(" ".getBytes());
                outputStream.write(user.getCountry().getDisplayName().getBytes());
                outputStream.write(" ".getBytes());
                outputStream.write(String.valueOf(user.isMale()).getBytes());
                outputStream.write(" ".getBytes());

                String lineSeparator = System.getProperty("line.separator");
                outputStream.write(lineSeparator.getBytes());
            }
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while (reader.ready()) {
                String userL = reader.readLine().trim();
                //Aleksei Antsyferov 581803200000 Ukraine true
                User user = new User();
                String temp = "";;
                user.setMale(Boolean.valueOf(userL.substring(userL.lastIndexOf(" ")).trim()));
                temp = userL.substring(0, userL.lastIndexOf(" "));//Aleksei Antsyferov 581803200000 Ukraine
                user.setCountry(valueOfLabel(temp.substring(temp.lastIndexOf(" ")).trim())); //Ukraine
                temp = temp.substring(0, temp.lastIndexOf(" "));//Aleksei Antsyferov 581803200000
                user.setBirthDate(new Date(Long.valueOf(temp.substring(temp.lastIndexOf(" ")).trim()))); //581803200000
                temp = temp.substring(0, temp.lastIndexOf(" "));//Aleksei Antsyferov
                user.setLastName(temp.substring(temp.lastIndexOf(" ")).trim());
                user.setFirstName(temp.substring(0, temp.lastIndexOf(" ")).trim());
                users.add(user);
            }
            reader.close();
        }

        public static User.Country valueOfLabel(String label) {
            for (User.Country e : User.Country.values()) {
                if (e.getDisplayName().equals(label)) {
                    return e;
                }
            }
            return null;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
