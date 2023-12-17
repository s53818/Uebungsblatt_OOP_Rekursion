package org.campus02.filesystem;

public abstract class FSEntry
{
    protected String name;
    public FSEntry(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public abstract int getSize();
    public abstract void print();
}
