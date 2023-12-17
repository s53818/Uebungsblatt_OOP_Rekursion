package org.campus02.filesystem;

public class File extends FSEntry
{
    private String extension;
    private int size;
    public File(String name, String extension, int size)
    {
        super(name);
        this.extension = extension;
        this.size = size;
    }
    @Override
    public String getName()
    {
        return name+"."+extension;
    }
    @Override
    public int getSize()
    {
        return size;
    }

    @Override
    public void print()
    {
        System.out.println(getName());
    }
}
