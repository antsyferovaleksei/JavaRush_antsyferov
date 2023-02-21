package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/

public class Solution{
    public static void main(String[] args) throws Exception {

        //String your_file_name = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test1.txt";
        File your_file_name = File.createTempFile("your_file_name", null);
        OutputStream outputStream = new FileOutputStream(your_file_name);
        InputStream inputStream = new FileInputStream(your_file_name);

        Solution solution = new Solution(4);
        solution.save(outputStream);
        outputStream.flush();

        Solution solution1 = new Solution(5);
        solution1.load(inputStream);

        System.out.println(solution.string.equals(solution1.string));
        inputStream.close();
    }

    private final transient String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int  temperature;
    String string;

    public Solution(int temperature)  {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }

    public void save(OutputStream outputStream) throws Exception {
        PrintWriter printWriter = new PrintWriter(outputStream);
        printWriter.println(this.string);
        printWriter.close();
    }

    public void load(InputStream inputStream) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        this.string = reader.readLine();
        reader.close();
    }
}
