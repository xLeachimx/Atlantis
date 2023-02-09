/* File: MemoryControl.java
 * Author: Dr. Michael Andrew Huelsman
 * Created On: 08 Feb 2023
 * Licence: GNU GPLv3
 * Purpose:
 *  An interface for describing a Memory Control/Scheduling meachanism for Atlantis.
 * Notes:
 */


public interface MemoryControl {
    public void set_storage(Storage primary, Storage secondary);
    public void load(int pid, byte[] data);
    public void unload(int pid);
    public void write(int pid, int addr);
    public void read(int pid, int addr);
}
