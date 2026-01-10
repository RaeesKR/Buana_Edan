package model;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Central catalog for game items (weapons, armors).
 * Add new items here or at runtime via the addX methods.
 */
public class ItemCatalog {
    private static final List<Weapon> weapons;
    private static final List<Armor> armors;

    static {
        weapons = new ArrayList<>(Arrays.asList(
            new Weapon("Attaque Java", 5,"/resource/images/weapon/Attaque Java.png"),
            new Weapon("Angriff", 9,"/resource/images/weapon/Angriff.png"),
            new Weapon("Qin Shin Huang", 15,"/resource/images/weapon/Qin Shin Huang.png"),
            new Weapon("Raphael", 19,"/resource/images/weapon/Raphael.png"),
            new Weapon("Field Bonds", 21,"/resource/images/weapon/Field Bonds.png"),
            new Weapon("Schwert Des Ruhms", 25,"/resource/images/weapon/Schwert Des Ruhms.png"),
            new Weapon("Susanoo", 28,"/resource/images/weapon/Susanoo.png"),
            new Weapon("Mythril", 30,"/resource/images/weapon/Mythril.png"),
            new Weapon("Reaper", 32,"/resource/images/weapon/Reaper.png"),
            new Weapon("Lost of Bali", 35,"/resource/images/weapon/Lost of Bali.png")

        ));

        armors = new ArrayList<>(Arrays.asList(
            new Armor("Champion", 6, "/resource/images/armor/Champion.png"),
            new Armor("Briar", 10, "/resource/images/armor/Briar.png"),
            new Armor("Aristocrat", 13, "/resource/images/armor/Aristocrat.png"),
            new Armor("Banished Knight", 18, "/resource/images/armor/Banished Knight.png"),
            new Armor("Bloodhound", 21, "/resource/images/armor/Bloodhound.png"),
            new Armor("Elden Lord", 24, "/resource/images/armor/Elden Lord.png"),
            new Armor("Blackflame", 26, "/resource/images/armor/Blackflame.png"),
            new Armor("Consort's", 33, "/resource/images/armor/Consort_s.png")
        ));
    }

    public static List<Weapon> getWeapons() {
        return Collections.unmodifiableList(weapons);
    }

    public static List<Armor> getArmors() {
        return Collections.unmodifiableList(armors);
    }

    public static void addWeapon(Weapon w) {
        if (w != null) weapons.add(w);
    }

    public static void addArmor(Armor a) {
        if (a != null) armors.add(a);
    }

    public static void setWeapons(List<Weapon> list) {
        weapons.clear();
        if (list != null) weapons.addAll(list);
    }

    public static void setArmors(List<Armor> list) {
        armors.clear();
        if (list != null) armors.addAll(list);
    }
}
