/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author chuna
 */
public class Device {

    private int dv_ID;
    private String dvName;
    private String manufacturer;
    private String quantity;
    private String category;
    private String state;
    private String details;
    private String specification;
    private String path;

    public Device(int dv_ID, String dvName, String manufacturer,
            String quantity, String category, String state,
            String details, String specification, String path) {
        this.dv_ID = dv_ID;
        this.dvName = dvName;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.category = category;
        this.state = state;
        this.details = details;
        this.specification = specification;
        this.path = path;
    }

   

    public int getDv_ID() {
        return dv_ID;
    }

    public String getDvName() {
        return dvName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public String getState() {
        return state;
    }

    public String getDetails() {
        return details;
    }

    public String getSpecification() {
        return specification;
    }

    public String getPath() {
        return path;
    }

}
