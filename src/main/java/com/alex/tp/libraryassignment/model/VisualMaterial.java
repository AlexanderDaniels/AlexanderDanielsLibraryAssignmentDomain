/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.model;

/**
 *
 * @author Alex
 */
public class VisualMaterial {
    private String id;
    private String typeOfVisualMaterial;
    private String nameOfVisualMaterial;

    public VisualMaterial(VisualMaterialBuilder builder) {
        this.id = builder.id;
        this.typeOfVisualMaterial = builder.typeOfVisualMaterial;
        this.nameOfVisualMaterial = builder.nameOfVisualMaterial;
    }

    public String getId() {
        return id;
    }

    public String getTypeOfVisualMaterial() {
        return typeOfVisualMaterial;
    }

    public String getNameOfVisualMaterial() {
        return nameOfVisualMaterial;
    }
    
    public static class VisualMaterialBuilder{
        private String id;
        private String typeOfVisualMaterial;
        private String nameOfVisualMaterial;

        public VisualMaterialBuilder(String id) {
            this.id = id;
        }

        public VisualMaterialBuilder getTypeOfVisualMaterial(String typeOfVisualMaterial) {
            this.typeOfVisualMaterial = typeOfVisualMaterial;
            return this;
        }

        public VisualMaterialBuilder getNameOfVisualMaterial(String nameOfVisualMaterial) {
            this.nameOfVisualMaterial = nameOfVisualMaterial;
            return this;
        }
        
        public VisualMaterialBuilder visualMaterial(VisualMaterial visualMaterial){
            id = visualMaterial.getId();
            typeOfVisualMaterial = visualMaterial.getTypeOfVisualMaterial();
            nameOfVisualMaterial = visualMaterial.getNameOfVisualMaterial();
            
            return this;
        }
        
        public VisualMaterial build(){
            return new VisualMaterial(this);
        }        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final VisualMaterial other = (VisualMaterial) obj;
        return true;
    }
    
    
    
    
}
