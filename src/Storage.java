/* File: Storage.java
 * Author: Dr. Michael Andrew Huelsman
 * Created On: 08 Feb 2023
 * Licence: GNU GPLv3
 * Purpose:
 *  A class for describing secondary storage control.
 * Notes:
 */


public class Storage {
    private byte[] disk;

    // Precond:
    //  size is an integer representing the numbe of bytes that can be stored in secondary storage.
    //
    // Postcond:
    //  Creates a new SecondaryStorage object which has the specified number of bytes set aside.
    public Storage(int size){
        disk = new byte[size];
    }

    // Precond:
    //  None.
    //
    // Postcond:
    //  Returns the size of the disk in bytes.
    public int getSize(){
        return disk.length;
    }

    // Precond:
    //  addr is the address on the disk where the data is to be placed.
    //  data is a valid array of bytes and contains the information to be written.
    //
    // Postcond:
    //  Writes the provided bytes (in order) to the disk.
    //  Returns true if the write occurred properly.
    //  Returns false if the write could not take place.
    public boolean writeTo(int addr, byte[] data){
        if(data == null || addr + data.length > disk.length)return false;
        for(int i = 0;i < data.length;i++){
            disk[addr+i] = data[i];
        }
        return true;
    }

    // Precond:
    //  addr is the address on the disk where the data is to be placed.
    //  size is a positive integer which indicates the number of bytes to read.
    //
    // Postcond:
    //  Reads the given amount of bytes into an array and returns it.
    //  Returns null if the read could not be done.
    public byte[] readFrom(int addr, int size){
        if(size <= 0 || addr+size > disk.length)return null;
        byte[] data = new byte[size];
        for(int i = 0;i < size;i++){
            data[i] = disk[addr+i];
        }
        return data;
    }
}
