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
        ArrayList<FSEntry> e = entries;
        if(e.isEmpty())
        {
            return 0;
        }
        return e.remove(0).getSize() + getSize();
    }

    @Override
    public void print()
    {
        System.out.println(entries.get(0).getName());
    }
}
