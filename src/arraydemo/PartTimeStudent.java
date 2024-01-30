/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemo;

/**
 *
 * @author michael
 */
public class PartTimeStudent extends Student{
    private int numOdCOurses;

    public PartTimeStudent(int numOdCOurses, int sid, String sname) {
        super(sid, sname);
        this.numOdCOurses = numOdCOurses;
    }

    public int getNumOdCOurses() {
        return numOdCOurses;
    }

    public void setNumOdCOurses(int numOdCOurses) {
        this.numOdCOurses = numOdCOurses;
    }
    
  
}
