//Class user/enkapsulasi
class User{
    private String username; // Deklarasi
    private String password; // variable

    //Method setter
    public void setUsername (String username){
        this.username = username;
    }

    public void setPassword (String password){
        this.password = password;
    }

    //Method getter
    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }
}

//Method utama
public void main(String[] args) {
    User rizal = new User(); //membuat objek dari class User

    //penggunaaan method setter
    rizal.setUsername("Rizal Nendian R");
    rizal.setPassword("rizal22052005");

    //penggunaan method getter
    System.out.println("Username: " + rizal.getUsername());
    System.out.println("Password: " + rizal.getPassword());
}