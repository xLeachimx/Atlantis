/* File: Scheduler.java
 * Author: Dr. Michael Andrew Huelsman
 * Created On: 08 Feb 2023
 * Licence: GNU GPLv3
 * Purpose:
 *  An interface for designing a process scheduler for Atlantis.
 * Notes:
 */

public interface Scheduler {
    public void addProcess(int pid, int priority);
    public void removeProcess(int pid);
    public int nextProcessToRun(int pid);
}
