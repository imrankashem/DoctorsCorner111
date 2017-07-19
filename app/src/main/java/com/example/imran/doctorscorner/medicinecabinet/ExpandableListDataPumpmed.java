package com.example.imran.doctorscorner.medicinecabinet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by imran on 7/15/2017.
 */

public class ExpandableListDataPumpmed {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();
        List<String> med1 = new ArrayList<String>();
        expandableListDetail.put("paracetamol", med1);
        med1.add(" * জ্বর, মাথাব্যথা, শরীর ব্যথার জন্য প্যারাসিটাল-৫০০ মি.গ্রা. (ডোজ : একটি করে দৈনিক তিনবার)" +
                "#ঔষধ গ্রহণ করার আগে ডাক্তারদের পরামর্শ নিন"   );
        List<String> med2 = new ArrayList<String>();
        expandableListDetail.put("Antacid", med2);
        med2.add(" *পেটে গ্যাস, পেট ফাঁপা, বুক জ্বালার জন্য এন্টাসিড (ডোজ : একটি করে দৈনিক তিন থেকে চারবার)" +
                "#ঔষধ গ্রহণ করার আগে ডাক্তারদের পরামর্শ নিন");


        List<String> med3 = new ArrayList<String>();
        expandableListDetail.put("Ranitidine", med3);
        med3.add("*পেপটিক আলসারজনিত সমস্যার জন্য রেনিটিডিন বা ওমিপ্রাজোল (ডোজ : একটি করে দৈনিক দুইবার)" +
                "#ঔষধ গ্রহণ করার আগে ডাক্তারদের পরামর্শ নিন");

        List<String> med4 = new ArrayList<String>();
        expandableListDetail.put("Orsaline", med4);
        med4.add(" * পেট খারাপের জন্য ওরস্যালাইন ও মেট্রোনিডাজল ৪০০ মি. গ্রা. (ডোজ : একটি করে দৈনিক তিনবার)" +
                "#ঔষধ গ্রহণ করার আগে ডাক্তারদের পরামর্শ নিন");
        List<String> med5 = new ArrayList<String>();
        expandableListDetail.put("Domperidone", med5);
        med5.add(" * বমি ও বদহজমের জন্য ডমপেরিডন (ডোজ : একটি করে দৈনিক তিনবার)" +
                "#ঔষধ গ্রহণ করার আগে ডাক্তারদের পরামর্শ নিন");
        List<String> med6 = new ArrayList<String>();
        expandableListDetail.put("desloratadine", med6);
        med6.add(" সর্দি-ঠান্ডার জন্য ডেসলোরাটিন (ডোজ : একটি করে সকাল ও রাতে)" +
                "#ঔষধ গ্রহণ করার আগে ডাক্তারদের পরামর্শ নিন");
        List<String> med7 = new ArrayList<String>();
        expandableListDetail.put("Adovas", med7);
        med7.add("  * কাশির জন্য যে কোনো কফ সিরাপ যেমন-এমব্রক্স বা অ্যাডোভাস (দুই চামচ করে সকাল ও রাতে)" +
                "#ঔষধ গ্রহণ করার আগে ডাক্তারদের পরামর্শ নিন");
        List<String> med8 = new ArrayList<String>();
        expandableListDetail.put("milk of magnesia", med8);
            med8.add("   * পায়খানা কষা হলে প্রচুর আঁশযুক্ত খাবার খেতে হবে ও আমিষ কম খেতে হবে।\n" +
                    "ওষুধ-মিল্ক অব ম্যাগনেশিয়া (ডোজ : দুই চামচ করে দিনে তিনবার)" +
                "#ঔষধ গ্রহণ করার আগে ডাক্তারদের পরামর্শ নিন");
        List<String> med9 = new ArrayList<String>();
        expandableListDetail.put("Antihistamine", med9);
        med9.add("  * অ্যালার্জির জন্য যে কোনো এন্টিহিসটামিন (ডোজ : একটি করে সকাল ও রাতে)" +
                "#ঔষধ গ্রহণ করার আগে ডাক্তারদের পরামর্শ নিন");
        List<String> med10 = new ArrayList<String>();
        expandableListDetail.put("Sterile Eye Drops", med10);
        med10.add("   * চোখওঠা ও চোখ লাল হলে স্টেরাইল আই ড্রপ ব্যবহার করতে হবে (দুই থেকে তিন ফোঁটা করে দিনে তিনবার)" +
                "#ঔষধ গ্রহণ করার আগে ডাক্তারদের পরামর্শ নিন");
        List<String> med11 = new ArrayList<String>();
        expandableListDetail.put("Antiseptic cotton", med11);
        med11.add("   * সাধারণ কাটাছেঁড়ার জন্য এন্টিসেপটিক, তুলা ও ব্যান্ডেজ ব্যবহার করতে হবে।" +
                "#ঔষধ গ্রহণ করার আগে ডাক্তারদের পরামর্শ নিন");
        List<String> med12 = new ArrayList<String>();
        expandableListDetail.put("Acetaminophen ", med12);
        med12.add("  *অ্যাসিটামিনোফেন একটি ব্যথা রিলিভার এবং জ্বর হ্রাসকারক.ঔষধ " +
                "#ঔষধ গ্রহণ করার আগে ডাক্তারদের পরামর্শ নিন");
      List<String> med13 = new ArrayList<String>();
        expandableListDetail.put("Adderall  ", med13);
        med13.add("  *  Adderall মনোযোগ ঘাটতি এবং\n" +
                "হাইপারটেন্সিবিলিটি ডিসর্ডার (এডিএইচডি)চ িকিত্সা করার জন্য ব্যবহৃত হয়। " +
                "#ঔষধ গ্রহণ করার আগে ডাক্তারদের পরামর্শ নিন");
        List<String> med14 = new ArrayList<String>();
        expandableListDetail.put("Amitriptyline   ", med14);
        med14.add("  *  আমিট্রিটিলিটি ব্যবহার করা হয়   বিষণ্নতা চ িকিত্সা করার জন্য ব্যবহৃত হয়। " +
                "#ঔষধ গ্রহণ করার আগে ডাক্তারদের পরামর্শ নিন");
        List<String> med15 = new ArrayList<String>();
        expandableListDetail.put("Hydrochlorothiazide  ", med15);
        med15.add("  * হাইড্রোক্লোরোথিয়াজাইড উচ্চ রক্তচাপ (হাইপারটেনশন) চিকিত্সা করার জন্য ব্যবহৃত হয়। " +
                "#ঔষধ গ্রহণ করার আগে ডাক্তারদের পরামর্শ নিন");
        List<String> med16= new ArrayList<String>();
        expandableListDetail.put("Lorazepam   ", med16);
        med16.add("  * লোরাজিপামটি উদ্বিগ্নতা রোগের চিকিৎসার জন্য ব্যবহৃত হয়।" +
                "#ঔষধ গ্রহণ করার আগে ডাক্তারদের পরামর্শ নিন");
        List<String> med17= new ArrayList<String>();
        expandableListDetail.put("Oxycodone    ", med17);
        med17.add("  *অক্সিসকোডন মধ্যপন্থী থেকে তীব্র ব্যথা উপশম করার জন্য ব্যবহার করা হয়।" +
                "#ঔষধ গ্রহণ করার আগে ডাক্তারদের পরামর্শ নিন");
        List<String> med18 = new ArrayList<String>();
        expandableListDetail.put("Ciprofloxacin     ", med18);
        med18.add("  *বিভিন্ন ধরণের ব্যাকটেরিয়াল সংক্রমণের জন্য সিপ্রোফ্লোক্সাকিন ব্যবহার করা হয়" +
                "#ঔষধ গ্রহণ করার আগে ডাক্তারদের পরামর্শ নিন");
        List<String> med19 = new ArrayList<String>();
        expandableListDetail.put("Metformin      ", med19);
        med19.add("  *মেটাফরমিন একটি মৌখিক ডায়াবেটিস মেডিসিন যা রক্তে শর্করার মাত্রা নিয়ন্ত্রণে সাহায্য করে।" +
                "#ঔষধ গ্রহণ করার আগে ডাক্তারদের পরামর্শ নিন");
        List<String> med20 = new ArrayList<String>();
        expandableListDetail.put("Doxycycline       ", med20);
        med20.add("  *ডোক্সাইসিক্লিনকে ডায়াবেটিস, বাধা, এবং রোসাসিয়া দ্বারা সৃষ্ট ব্রণ-এর মতো ক্ষতবিক্ষত আচরণের জন্য ব্যবহার করা হয়। " +
                "#ঔষধ গ্রহণ করার আগে ডাক্তারদের পরামর্শ নিন");
        List<String> med21 = new ArrayList<String>();
        expandableListDetail.put("Cymbalta        ", med21);
        med21.add("  * ফুফ্রোমাই্লজিয়া (দীর্ঘস্থায়ী ব্যাথা ব্যাধি), বা দীর্ঘস্থায়ী পেশী বা যৌথ ব্যথা (যেমন নিম্ন স্তন ব্যথা এবং অস্টিওআর্থারাইটিস ব্যথা)  চিকিত্সা করার জন্য প্রাপ্ত বয়স্কদের মধ্যে সিম্বলাও ব্যবহার করা হয়। " +
                "#ঔষধ গ্রহণ করার আগে ডাক্তারদের পরামর্শ নিন");
  List<String> med22 = new ArrayList<String>();
        expandableListDetail.put("Viagra         ", med22);
        med22.add("  * ভায়াগ্রা ফুসফুসে ধমনী উচ্চ রক্তচাপের চিকিৎসা এবং পুরুষদের ও মহিলাদের মধ্যে ব্যায়ামের ক্ষমতা উন্নত করতে ব্যবহৃত হয়। " +
                "#ঔষধ গ্রহণ করার আগে ডাক্তারদের পরামর্শ নিন");
        List<String> med23 = new ArrayList<String>();
        expandableListDetail.put("Metoprolol          ", med23);
        med23.add("  *হার্ট অ্যাটাকের চিকিৎসা বা প্রতিরোধ করার জন্য Metoprolol  ব্যবহার করা হয় " +
                "#ঔষধ গ্রহণ করার আগে ডাক্তারদের পরামর্শ নিন");
        List<String> med24 = new ArrayList<String>();
        expandableListDetail.put("Lyrica           ", med24);
        med24.add("  *লিরিকিয়া জীবাণু নিয়ন্ত্রণ করতে এবং ডায়াবেটিস (ডায়াবেটিক নিউওরপ্যাথি), হারপেস জাস্টিস (শিরীনাগলি স্নায়ুরোগিয়া বা মেরুদন্ডে আঘাতজনিত" +
                "ক্ষতির কারণে সৃষ্ট ব্যথা উপশমে ব্যবহার করা হয়। " +
                "#ঔষধ গ্রহণ করার আগে ডাক্তারদের পরামর্শ নিন");


        List<String> med25 = new ArrayList<String>();
        expandableListDetail.put("Metformin           ", med25);
        med25.add("  *টাইপ ২ ডায়াবেটিস সহ রক্তে শর্করার নিয়ন্ত্রণ উন্নত করার জন্য মেটফরমিন ব্যবহার করা হয়।এটি কখনও কখনও ইনসুলিন বা অন্যান্য ঔষধের সংমিশ্রণে ব্যবহৃত হয়, তবে এই ঔষধটি টাইপ 1 ডায়াবেটিসের চিকিত্সার জন্য নয়। " +
                "#ঔষধ গ্রহণ করার আগে ডাক্তারদের পরামর্শ নিন");
        List<String> med26 = new ArrayList<String>();
        expandableListDetail.put("Pantoprazole           ", med26);
        med26.add("  *প্যানট্রাপ্রেজোলটি ক্ষতিকারক অক্সফ্যাগাইটিস (পেট এসিড থেকে অক্সফ্যাগাসের ক্ষতি), এবং জোলিনজার-এলিসন সিন্ড্রোমের মতো অতিরিক্ত পেট এসিডের সাথে জড়িত অন্যান্য অবস্থার জন্য ব্যবহৃত হয়।" +
                "#ঔষধ গ্রহণ করার আগে ডাক্তারদের পরামর্শ নিন");
        List<String> med27 = new ArrayList<String>();
        expandableListDetail.put("Prednisone            ", med27);
        med27.add("  *Prednisone এলার্জি রোগ, ত্বক অবস্থার, ক্ষতিকারক কোলাইটিস, আর্থ্রাইটিস, লিউসাস, সেরিয়াসিস বা শ্বাস-প্রশ্বাসের চিকিৎসা বা প্রতিরোধ করার জন্য   ব্যবহার করা হয়    "
                +"#ঔষধ গ্রহণ করার আগে ডাক্তারদের পরামর্শ নিন");

        List<String> med28 = new ArrayList<String>();
        expandableListDetail.put("Warfarin             ", med28);
        med28.add("  *Warfarin  রক্তের ঘনত্বকে প্রতিরোধ করা বা চিকিত্সা করার জন্য ব্যবহার করা হয়"  +"#ঔষধ গ্রহণ করার আগে ডাক্তারদের পরামর্শ নিন");
        List<String> med29 = new ArrayList<String>();
        expandableListDetail.put("Warfarin             ", med29);
        med29.add("  *Warfarin  রক্তের ঘনত্বকে প্রতিরোধ করা বা চিকিত্সা করার জন্য ব্যবহার করা হয়"  +"#ঔষধ গ্রহণ করার আগে ডাক্তারদের পরামর্শ নিন");

        return expandableListDetail;
    }
    }
