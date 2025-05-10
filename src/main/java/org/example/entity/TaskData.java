package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class TaskData {

   private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
   private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> unassignedTasks, Set<Task> carolsTasks, Set<Task> bobsTasks) {
        this.annsTasks = annsTasks;
        this.unassignedTasks = unassignedTasks;
        this.carolsTasks = carolsTasks;
        this.bobsTasks = bobsTasks;
    }

    public Set<Task> getTasks(String name) {
        switch (name.toLowerCase()) {
            case "ann":
                return annsTasks;
            case "bob":
                return bobsTasks;
            case "carol":
                return carolsTasks;

        }
        return unassignedTasks;
    }



    public Set<Task> getUnion(Set<Task> set1, Set<Task> set2) {
        Set<Task> union = new HashSet<>();
        union.addAll(set1);
        union.addAll(set2);
        return union;
    }
    public Set<Task> getIntersection(Set<Task> set1, Set<Task> set2) {
        Set<Task> intersection = new HashSet<>();
        intersection.addAll(set1);
        intersection.retainAll(set2);
        return intersection;
    }
    public Set<Task> getDifferences(Set<Task> set1, Set<Task> set2) {
        Set<Task> difference = new HashSet<>();
        difference.addAll(set1);
        difference.removeAll(set2);
        return difference;
    }



}
