package com.mfaziz.arisanku;

import com.mfaziz.arisanku.entity.Arisan;
import com.mfaziz.arisanku.entity.User;
import java.util.ArrayList;
import java.util.Collections;

public class Store {
    private static final ArrayList<User> users = new ArrayList<>();
    private static final ArrayList<Arisan> arisans = new ArrayList<>();
    
    public static void seed() throws Exception {
        // seeding user
        User mfaziz = new User("mfaziz", "123");
        mfaziz.deposit(1000_000, "Deposit");
        addUser(mfaziz);
        
        User yanto = new User("yanto", "123");
        yanto.deposit(1000_000, "Deposit");
        addUser(yanto);
        
        User budi = new User("budi", "123");
        budi.deposit(500_000, "Deposit");
        addUser(budi);
        
        User handoko = new User("handoko", "123");
        handoko.deposit(800_000, "Deposit");
        addUser(handoko);
        
        User yanti = new User("yanti", "123");
        yanti.deposit(1_000_000, "Deposit");
        addUser(yanti);
        
        User elonMusk = new User("elon musk", "123");
        elonMusk.deposit(999_999_999, "Deposit");
        addUser(elonMusk);
        
        User markZuckerberg = new User("mark zuckerberg", "123");
        markZuckerberg.deposit(666_666_666, "Deposit");
        addUser(markZuckerberg);
        
        User billGates = new User("bill gates", "123");
        billGates.deposit(777_777_777, "deposit");
        addUser(billGates);
        
        User jeffBezos = new User("jeff bezos", "123");
        jeffBezos.deposit(888_888_888, "Deposit");
        addUser(jeffBezos);
        
        // seeding arisan
        Arisan RT10 = new Arisan("RT10", 5_000, mfaziz);
        RT10.addMember(yanto);
        RT10.addMember(yanti);
        RT10.addMember(budi);
        RT10.addMember(elonMusk);
        RT10.startSeason();
        RT10.draw();
        RT10.draw();
        RT10.draw();
        addArisan(RT10);
        
        Arisan RW04 = new Arisan("RW04", 10_000, yanto);
        RW04.addMember(mfaziz);
        RW04.addMember(handoko);
        RW04.addMember(yanti);
        RW04.addMember(elonMusk);
        RW04.addMember(jeffBezos);
        RW04.addMember(budi);
        RW04.startSeason();
        RW04.draw();
        addArisan(RW04);
        
        Arisan RT06 = new Arisan("RT05", 6_000, yanto);
        RT06.addMember(budi);
        addArisan(RT06);
        
        Arisan elitGlobal = new Arisan("ELIT GLOBAL", 1_000_000, elonMusk);
        elitGlobal.addMember(markZuckerberg);
        elitGlobal.addMember(billGates);
        elitGlobal.addMember(jeffBezos);
        elitGlobal.startSeason();
        elitGlobal.draw();
        elitGlobal.draw();
        elitGlobal.draw();
        addArisan(elitGlobal);
        
        Arisan barudakLosantos = new Arisan("Barudak Losantos", 100_000, billGates);
        barudakLosantos.addMember(markZuckerberg);
        barudakLosantos.addMember(jeffBezos);
        addArisan(barudakLosantos);
    }
    
    public static User getUserByUsername(String username) throws Exception {
        for(User user: users) 
            if(user.username.equals(username))
                return user;
        
        throw new Exception("user not found");
    }
    
    public static Arisan getArisanById(String id) throws Exception {
        for(Arisan arisan: arisans) 
            if(arisan.getId().equals(id))
                return arisan;
        
        throw new Exception("not found");
    }
    
    public static void addUser(User newUser) throws Exception {
        for(User user: users) 
            if(user.username.equals(newUser.username))
                throw new Exception("username already takken");
        
        users.add(newUser);
    }
    
    public static void addArisan(Arisan newArisan) throws Exception {
        for(Arisan arisan: arisans)
            if(arisan.getId().equals(newArisan.getId()))
                throw new Exception("id already takken");
        
        arisans.add(newArisan);
    }
    
    public static User getUserByUsernameAndPassword(String username, String password) throws Exception {
        for(User user: users) 
            if(user.username.equals(username) && user.password.equals(password))
                return user;
        
        throw new Exception("credential not metch");
    }
    
    public static ArrayList<Arisan> getUserArisan(User user) {
        ArrayList<Arisan> result = new ArrayList<>();
        for (Arisan arisan: arisans) {
            for(User member: arisan.getMembers()) 
                if (member.equals(user)) result.add(arisan);
        }
        return result;
    }
    
    public static ArrayList<Arisan> getArisanExceptUser(User user) {
        ArrayList<Arisan> result = new ArrayList<>();
        for (Arisan arisan: arisans) {
            boolean exist = false;
            
            for(User member: arisan.getMembers()) 
                if (member.equals(user)) exist = true;
            
            if(!exist) result.add(arisan);
        }
        return result;
    }
    
    public static ArrayList<User> getRank() {
        ArrayList<User> result = (ArrayList<User>) users.clone();
        Collections.sort(result, Collections.reverseOrder());
        
        for(int i = result.size()-1; i>8; i--)
            result.remove(i);
        
        return result;
    }
}
