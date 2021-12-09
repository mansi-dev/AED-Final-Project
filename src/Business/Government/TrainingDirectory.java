/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Government;

import java.util.ArrayList;

/**
 *
 * @author Mayan Mishra
 */
public class TrainingDirectory {
    
    private ArrayList<TrainingOraganization> training;
    
    public ArrayList<TrainingOraganization> getTraining() {
        return training;
    }

    public void setTraining(ArrayList<TrainingOraganization> training) {
        this.training = training;
    }
    
        public TrainingOraganization addNewEntry() {
        
        TrainingOraganization newEntry = new TrainingOraganization();
        training.add(newEntry);
        return newEntry;

    }

    
}
