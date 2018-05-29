package java_example_20180525;
//account 클래스
public class banksystem {
private String ano;
private String owner;
private int balance;

//생성자
public banksystem(String ano, String owner, int balance) {
	
this.ano=ano;
this.owner=owner;
this.balance=balance;
}
//getter setter 메소드

public String getAno() {return ano;}
public void setAno(String ano) {this.ano=ano;}
public String getOwner() {return owner;}
public void setowner(String owner) {this.owner=owner;}
public int getBalance() {return balance;}
public void setBalance(int balance) {this.balance = balance;}

}




