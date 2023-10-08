package com.mfaziz.arisanku.entity;

import java.util.ArrayList;
import java.util.Random;

public class Arisan {
    public String name;
    private String id;
    private final User admin;
    private int price;
    private int prize;
    private final ArrayList<User> members;
    private boolean duringSeason;
    private final ArrayList<User> notWonYet;

    public Arisan(String name, int price, User admin) {
        this.admin = admin;
        this.name = name;
        this.price = price;
        this.prize = 0;
        members = new ArrayList<>();
        notWonYet = new ArrayList<>();
        duringSeason = false;
        members.add(admin);
        generateId();
        calculatePrize();
    }
    
    private void generateId() {
        String charSet = "0123456789";
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(5);
        
        for (int i = 0; i < 5; i++) {
            int randomIndex = random.nextInt(charSet.length());
            char randomChar = charSet.charAt(randomIndex);
            stringBuilder.append(randomChar);
        }
        
        id = stringBuilder.toString();
    }
    
    public int getPrize() {
        return prize;
    }
    
    public int getPrice() {
        return price;
    }
    
    public ArrayList<User> getMembers() {
        return members;
    }
    
    public String getId() {
        return id;
    }
    
    public User getAdmin() {
        return admin;
    }
    
    public boolean isUserWon(User user) throws Exception {
        boolean isMember = false;
        for(User member: members) {
            if(member.equals(user))
                isMember = true;
        }
        if (!isMember) throw new Exception("user is not member");
        
        for(User member: notWonYet) {
            if(member.equals(user))
                return false;
        }
        return true;
    }
    
    private void calculatePrize() {
        prize = price * members.size();
    }

    public void addMember(User newMember) throws Exception {
        if (duringSeason)
            throw new Exception("can't join arisan during season, comeback later :)");
        
        members.add(newMember);
        calculatePrize();
    }

    public void removeMember(User user) throws Exception {
        if (duringSeason)
            throw new Exception("can't live during season");
        
        if(!members.remove(user))
            throw new Exception("failed to remove member");
        
        calculatePrize();
    }

    public int getTotalMember() {
        return members.size();
    }

    public void startSeason() throws Exception {
        if (duringSeason) 
            throw new Exception("already in sesason");
        
        duringSeason = true;
        for (User member : members)
            notWonYet.add(member);
    }

    public boolean getDuringSession() {
        return duringSeason;
    }
    
    public void setPrice(int price) throws Exception {
        if(duringSeason) 
            throw new Exception("cannot set price durring session");
        
        if(price<=0)
            throw new Exception("price can't less than 1");
        
        this.price = price;
        calculatePrize();
    }

    public String draw() throws Exception {
        if (!duringSeason) 
            throw new Exception("season not started yet");
        
        for(User member: members) {
            if(member.getBalance()<price) 
                throw new Exception("some of member didn't have enough balance (miskin) : " + member.username);
        }
        
        for(User member: members) 
            member.withdraw(price, "Joint venture " + name + " arisan");
        
        int index = new Random().nextInt(notWonYet.size());
        User winner = notWonYet.get(index);
        
        winner.deposit(prize, "Winning " + name + " arisan");
        notWonYet.remove(index);
        
        if(notWonYet.isEmpty()) duringSeason = false;
        
        return winner.username;
    }
}
