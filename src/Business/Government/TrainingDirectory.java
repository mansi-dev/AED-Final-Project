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
    
    private ArrayList<TrainingOraganization> trainingOrg = new ArrayList();
    
    public ArrayList<TrainingOraganization> getTraining() {
        return trainingOrg;
    }

    public void setTraining(ArrayList<TrainingOraganization> trainingOrg) {
        this.trainingOrg = trainingOrg;
    }
    
        public TrainingOraganization addNewEntry() {
        
        TrainingOraganization newEntry = new TrainingOraganization();
        trainingOrg.add(newEntry);
        return newEntry;

    }

    public void deleteRows(TrainingOraganization selectedRow) {
        trainingOrg.remove(selectedRow);
    }

    
}
