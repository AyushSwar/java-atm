package utlity;

public class Users {
    private String name;
    private Integer number;

    private String address;
    private Double amount;

    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public Integer getNumber(){
        return number;
    }
    public void setNumber(Integer newNumber){
        this.number = newNumber;
     }

     public String getAddress(){
        return address;
     }
     public void setAddress(String newAddress){
        this.address = newAddress;
     }

    public Double getAmount(){
        return amount;
    }
    public void setAmount(Double newAmount){
        this.amount = newAmount;
    }

}

