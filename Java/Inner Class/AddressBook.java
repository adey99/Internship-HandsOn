public class AddressBook{
    class Address{
        private String name,street,city,state;
        public Address() {
            name="";
            street="";
            city="";
            state="";
        }
        public String getName(){
           return this.name; 
        }
        public void setName(String name){
            this.name = name;
        }
        public String getStreet(){
            return this.street;
        }
        public void setStreet(String street){
            this.street = street;
        }
        public String getCity(){
            return this.city;
        }
        public void setCity(String city){
            this.city = city;
        }
        public String getState(){
            return this.state;
        }
        public void setState(String state){
            this.state =state;
        }
    }
    private long phoneNumber;
    private Address tempAddress;
    private Address permAddress;
    public AddressBook() {
        tempAddress = new Address();
        permAddress = new Address();
        phoneNumber=0;
    }
    public long getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public Address getTempAddress(){
        return this.tempAddress;
    }
    public void setTempAddress(Address tempAddress){
        this.tempAddress=tempAddress;
    }
    public Address getPermAddress(){
        return this.permAddress;
    }
    public void setPermAddress(Address permAddress){
        this.permAddress = permAddress;
    }
}