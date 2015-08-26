package dsa.recursion;

import java.io.File;

/**
 * Created by szagoret on 8/26/2015.
 */
public class DiskUsage {

    /**
     * Calculates the total disk usage (in bytes) of the portion of the file system rooted
     * at the given path, while printing a summary akin to the standard 'du' Unix tool.
     *
     * @param root
     * @return
     */
    public static long usage(File root) {
        long total = root.length();                     // start with direct disk usage
        if (root.isDirectory()) {                       // and if this is a directory,
            String[] listFiles = root.list();
            if (listFiles != null) {
                for (String childName : listFiles) {      // then for each child
                    File child = new File(root, childName); // compose full path to child
                    total += usage(child);                  // add child’s usage to total
                }
            }
        }
        System.out.println(total + "\t" + root);
        return total;
    }

    public static void main(String[] args) {
        usage(new File("C:\\Users\\szagoret\\Documents"));
    }
}
