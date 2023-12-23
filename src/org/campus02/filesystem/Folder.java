package org.campus02.filesystem;

import java.util.ArrayList;

public class Folder extends FSEntry
{
    private ArrayList<FSEntry> entries = new ArrayList<>();

    public Folder(String name)
    {
        super(name);
    }

    public void addEntry(FSEntry entry)
    {
        entries.add(entry);
    }
    @Override
    public int getSize()
    {
        ArrayList<FSEntry> e = new ArrayList<>(entries);
        return sumSizeRecursive(e);
    }
    private int sumSizeRecursive(ArrayList<FSEntry> entries)
    {
        if(entries.isEmpty())
        {
            return 0;
        }
        return entries.remove(0).getSize() + sumSizeRecursive(entries);
    }
    @Override
    public void print()
    {
        ArrayList<FSEntry> e = new ArrayList<>(entries);
        printRecursive(e);
    }

    private void printRecursive(ArrayList<FSEntry> e)
    {
        if(e.isEmpty())
        {
            return;
        }
        System.out.println(e.remove(0).getName());
        printRecursive(e);
    }
}
