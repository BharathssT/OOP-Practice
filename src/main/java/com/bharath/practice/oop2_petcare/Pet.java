    package com.bharath.practice.oop2_petcare;

    public class Pet {

        private String name;
        private String type;
        Owner owner;

        public Pet(String name, String type){
            this.name = name;
            this.type = type;
            this.owner = null;
        }

        public String getName(){return name;}
        public String getType(){return type;}

        public void getInfo(){
            System.out.println("The name of the pet is: "+getName()+ " and it is a: "+getType());

            if(owner == null){
                System.out.println("Owner: No owner assigned yet");
            }
            else {
                System.out.println("The name of the owner is: "+owner.getName()+"("+owner.getPhNumber()+")");
            }
        }

        public void assignOwner(Owner owner){
            this.owner = owner;
        }
    }
