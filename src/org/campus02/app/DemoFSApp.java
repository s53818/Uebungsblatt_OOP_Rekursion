package org.campus02.app;

import org.campus02.filesystem.File;
import org.campus02.filesystem.Folder;

public class DemoFSApp
{
    public static void main(String[] args)
    {
        File f1 = new File("demo1","txt",20);
        File f2 = new File("demo2","txt",20);
        File f3 = new File("demo3","txt",20);

        Folder folder = new Folder("Demo");
        folder.addEntry(f1);
        folder.addEntry(f2);
        folder.addEntry(f3);

        //System.out.println(folder.getSize());
        folder.print();
    }
}
