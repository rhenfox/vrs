package com.vrs.data;

/**
 *
 * @author Aldrin
 */
import java.util.ArrayList;

public class ComboBoxList {

    private String id;
    private String name;
    

    public ComboBoxList() {
    }

    public ComboBoxList(String ids, String description) {
        this.id = ids;
        this.name = description;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setSelectedId(ArrayList<ComboBoxList> Comboboxs, String Id, javax.swing.JComboBox cbo) {
        for (ComboBoxList it : Comboboxs) {
            if (it.getId().equals(Id)) {
                cbo.setSelectedItem(it);
            }

        }
    }

    public void setSelectedDescription(ArrayList<ComboBoxList> Comboboxs, String desc, javax.swing.JComboBox cbo) {
        for (ComboBoxList it : Comboboxs) {
            if (it.getName().trim().equals(desc.trim())) {
                cbo.setSelectedItem(it);
            }
        }
    }

    @Override
    public String toString() {
        return this.name;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    


}
