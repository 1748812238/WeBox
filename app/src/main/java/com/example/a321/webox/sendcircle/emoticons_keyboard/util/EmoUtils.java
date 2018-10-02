package com.example.a321.webox.sendcircle.emoticons_keyboard.util;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.text.SpannableString;
import android.util.ArrayMap;

import com.example.a321.webox.R;

@RequiresApi(api = Build.VERSION_CODES.KITKAT)
public class EmoUtils {

    public static final int EMOTION_CLASSIC_TYPE = 0x0001;

    public static ArrayMap<String,Integer> EMPTY_MAP;
    public static ArrayMap<String,Integer> EMOTION_CLASSIC_MAP;

    static {
        EMPTY_MAP = new ArrayMap<>();
        EMOTION_CLASSIC_MAP = new ArrayMap<>();

        EMOTION_CLASSIC_MAP.put("[emo_1]",R.drawable.emo_1);
        EMOTION_CLASSIC_MAP.put("[emo_2]",R.drawable.emo_2);
        EMOTION_CLASSIC_MAP.put("[emo_3]",R.drawable.emo_3);
        EMOTION_CLASSIC_MAP.put("[emo_4]",R.drawable.emo_4);
        EMOTION_CLASSIC_MAP.put("[emo_5]",R.drawable.emo_5);
        EMOTION_CLASSIC_MAP.put("[emo_6]",R.drawable.emo_6);
        EMOTION_CLASSIC_MAP.put("[emo_7]",R.drawable.emo_7);
        EMOTION_CLASSIC_MAP.put("[emo_8]",R.drawable.emo_8);
        EMOTION_CLASSIC_MAP.put("[emo_9]",R.drawable.emo_9);
        EMOTION_CLASSIC_MAP.put("[emo_10]",R.drawable.emo_10);
        EMOTION_CLASSIC_MAP.put("[emo_11]",R.drawable.emo_11);
        EMOTION_CLASSIC_MAP.put("[emo_12]",R.drawable.emo_12);
        EMOTION_CLASSIC_MAP.put("[emo_13]",R.drawable.emo_13);
        EMOTION_CLASSIC_MAP.put("[emo_14]",R.drawable.emo_14);
        EMOTION_CLASSIC_MAP.put("[emo_15]",R.drawable.emo_15);
        EMOTION_CLASSIC_MAP.put("[emo_16]",R.drawable.emo_16);
        EMOTION_CLASSIC_MAP.put("[emo_17]",R.drawable.emo_17);
        EMOTION_CLASSIC_MAP.put("[emo_18]",R.drawable.emo_18);
        EMOTION_CLASSIC_MAP.put("[emo_19]",R.drawable.emo_19);
        EMOTION_CLASSIC_MAP.put("[emo_20]",R.drawable.emo_20);
        EMOTION_CLASSIC_MAP.put("[emo_21]",R.drawable.emo_21);
        EMOTION_CLASSIC_MAP.put("[emo_22]",R.drawable.emo_22);
        EMOTION_CLASSIC_MAP.put("[emo_23]",R.drawable.emo_23);
        EMOTION_CLASSIC_MAP.put("[emo_24]",R.drawable.emo_24);
        EMOTION_CLASSIC_MAP.put("[emo_25]",R.drawable.emo_25);
        EMOTION_CLASSIC_MAP.put("[emo_26]",R.drawable.emo_26);
        EMOTION_CLASSIC_MAP.put("[emo_27]",R.drawable.emo_27);
        EMOTION_CLASSIC_MAP.put("[emo_28]",R.drawable.emo_28);
        EMOTION_CLASSIC_MAP.put("[emo_29]",R.drawable.emo_29);
        EMOTION_CLASSIC_MAP.put("[emo_30]",R.drawable.emo_30);
        EMOTION_CLASSIC_MAP.put("[emo_31]",R.drawable.emo_31);
        EMOTION_CLASSIC_MAP.put("[emo_32]",R.drawable.emo_32);
        EMOTION_CLASSIC_MAP.put("[emo_33]",R.drawable.emo_33);
        EMOTION_CLASSIC_MAP.put("[emo_34]",R.drawable.emo_34);
        EMOTION_CLASSIC_MAP.put("[emo_35]",R.drawable.emo_35);
        EMOTION_CLASSIC_MAP.put("[emo_36]",R.drawable.emo_36);
        EMOTION_CLASSIC_MAP.put("[emo_37]",R.drawable.emo_37);
        EMOTION_CLASSIC_MAP.put("[emo_38]",R.drawable.emo_38);
        EMOTION_CLASSIC_MAP.put("[emo_39]",R.drawable.emo_39);
        EMOTION_CLASSIC_MAP.put("[emo_40]",R.drawable.emo_40);
        EMOTION_CLASSIC_MAP.put("[emo_41]",R.drawable.emo_41);
        EMOTION_CLASSIC_MAP.put("[emo_42]",R.drawable.emo_42);
        EMOTION_CLASSIC_MAP.put("[emo_43]",R.drawable.emo_43);
        EMOTION_CLASSIC_MAP.put("[emo_44]",R.drawable.emo_44);
        EMOTION_CLASSIC_MAP.put("[emo_45]",R.drawable.emo_45);
        EMOTION_CLASSIC_MAP.put("[emo_46]",R.drawable.emo_46);
        EMOTION_CLASSIC_MAP.put("[emo_47]",R.drawable.emo_47);
        EMOTION_CLASSIC_MAP.put("[emo_48]",R.drawable.emo_48);
        EMOTION_CLASSIC_MAP.put("[emo_49]",R.drawable.emo_49);
        EMOTION_CLASSIC_MAP.put("[emo_50]",R.drawable.emo_50);
        EMOTION_CLASSIC_MAP.put("[emo_51]",R.drawable.emo_51);
        EMOTION_CLASSIC_MAP.put("[emo_52]",R.drawable.emo_52);
        EMOTION_CLASSIC_MAP.put("[emo_53]",R.drawable.emo_53);
        EMOTION_CLASSIC_MAP.put("[emo_54]",R.drawable.emo_54);
        EMOTION_CLASSIC_MAP.put("[emo_55]",R.drawable.emo_55);
        EMOTION_CLASSIC_MAP.put("[emo_56]",R.drawable.emo_56);
        EMOTION_CLASSIC_MAP.put("[emo_57]",R.drawable.emo_57);
        EMOTION_CLASSIC_MAP.put("[emo_58]",R.drawable.emo_58);
        EMOTION_CLASSIC_MAP.put("[emo_59]",R.drawable.emo_59);
        EMOTION_CLASSIC_MAP.put("[emo_60]",R.drawable.emo_60);
        EMOTION_CLASSIC_MAP.put("[emo_61]",R.drawable.emo_61);
        EMOTION_CLASSIC_MAP.put("[emo_62]",R.drawable.emo_62);
        EMOTION_CLASSIC_MAP.put("[emo_63]",R.drawable.emo_63);
        EMOTION_CLASSIC_MAP.put("[emo_64]",R.drawable.emo_64);
        EMOTION_CLASSIC_MAP.put("[emo_65]",R.drawable.emo_65);
        EMOTION_CLASSIC_MAP.put("[emo_66]",R.drawable.emo_66);
        EMOTION_CLASSIC_MAP.put("[emo_67]",R.drawable.emo_67);
        EMOTION_CLASSIC_MAP.put("[emo_68]",R.drawable.emo_68);
        EMOTION_CLASSIC_MAP.put("[emo_69]",R.drawable.emo_69);
        EMOTION_CLASSIC_MAP.put("[emo_70]",R.drawable.emo_70);
        EMOTION_CLASSIC_MAP.put("[emo_71]",R.drawable.emo_71);
        EMOTION_CLASSIC_MAP.put("[emo_72]",R.drawable.emo_72);
        EMOTION_CLASSIC_MAP.put("[emo_73]",R.drawable.emo_73);
        EMOTION_CLASSIC_MAP.put("[emo_74]",R.drawable.emo_74);
        EMOTION_CLASSIC_MAP.put("[emo_75]",R.drawable.emo_75);
        EMOTION_CLASSIC_MAP.put("[emo_76]",R.drawable.emo_76);
        EMOTION_CLASSIC_MAP.put("[emo_77]",R.drawable.emo_77);
        EMOTION_CLASSIC_MAP.put("[emo_78]",R.drawable.emo_78);
        EMOTION_CLASSIC_MAP.put("[emo_79]",R.drawable.emo_79);
        EMOTION_CLASSIC_MAP.put("[emo_80]",R.drawable.emo_80);
        EMOTION_CLASSIC_MAP.put("[emo_81]",R.drawable.emo_81);
        EMOTION_CLASSIC_MAP.put("[emo_82]",R.drawable.emo_82);
        EMOTION_CLASSIC_MAP.put("[emo_83]",R.drawable.emo_83);
        EMOTION_CLASSIC_MAP.put("[emo_84]",R.drawable.emo_84);
        EMOTION_CLASSIC_MAP.put("[emo_85]",R.drawable.emo_85);
        EMOTION_CLASSIC_MAP.put("[emo_86]",R.drawable.emo_86);
        EMOTION_CLASSIC_MAP.put("[emo_87]",R.drawable.emo_87);
        EMOTION_CLASSIC_MAP.put("[emo_88]",R.drawable.emo_88);
        EMOTION_CLASSIC_MAP.put("[emo_89]",R.drawable.emo_89);
        EMOTION_CLASSIC_MAP.put("[emo_90]",R.drawable.emo_90);
        EMOTION_CLASSIC_MAP.put("[emo_91]",R.drawable.emo_91);
        EMOTION_CLASSIC_MAP.put("[emo_92]",R.drawable.emo_92);
        EMOTION_CLASSIC_MAP.put("[emo_93]",R.drawable.emo_93);
        EMOTION_CLASSIC_MAP.put("[emo_94]",R.drawable.emo_94);
        EMOTION_CLASSIC_MAP.put("[emo_95]",R.drawable.emo_95);
        EMOTION_CLASSIC_MAP.put("[emo_96]",R.drawable.emo_96);
        EMOTION_CLASSIC_MAP.put("[emo_97]",R.drawable.emo_97);
        EMOTION_CLASSIC_MAP.put("[emo_98]",R.drawable.emo_98);
        EMOTION_CLASSIC_MAP.put("[emo_99]",R.drawable.emo_99);
        EMOTION_CLASSIC_MAP.put("[emo_100]",R.drawable.emo_100);
        EMOTION_CLASSIC_MAP.put("[emo_101]",R.drawable.emo_101);
        EMOTION_CLASSIC_MAP.put("[emo_102]",R.drawable.emo_102);
        EMOTION_CLASSIC_MAP.put("[emo_103]",R.drawable.emo_103);
        EMOTION_CLASSIC_MAP.put("[emo_104]",R.drawable.emo_104);
        EMOTION_CLASSIC_MAP.put("[emo_105]",R.drawable.emo_105);
        EMOTION_CLASSIC_MAP.put("[emo_106]",R.drawable.emo_106);
        EMOTION_CLASSIC_MAP.put("[emo_107]",R.drawable.emo_107);
        EMOTION_CLASSIC_MAP.put("[emo_108]",R.drawable.emo_108);
        EMOTION_CLASSIC_MAP.put("[emo_109]",R.drawable.emo_109);
        EMOTION_CLASSIC_MAP.put("[emo_110]",R.drawable.emo_110);
        EMOTION_CLASSIC_MAP.put("[emo_111]",R.drawable.emo_111);
        EMOTION_CLASSIC_MAP.put("[emo_112]",R.drawable.emo_112);
        EMOTION_CLASSIC_MAP.put("[emo_113]",R.drawable.emo_113);
    }

    /**
     * 根据名称获取当前表情图标R值
     * @param EmotionType  表情类型标志符
     * @param imgName   名称
     * @return
     */
    public static int getImgByName(int EmotionType,String imgName){
        Integer integer = null;
        switch (EmotionType){
            case EMOTION_CLASSIC_TYPE:
                integer = EMOTION_CLASSIC_MAP.get(imgName);
                break;
            default:
                break;
        }
        return integer == null ? -1 : integer;
    }

    /**
     * 根据类型获取表情数据
     * @param EmotionType
     * @return
     */
    public static ArrayMap<String,Integer> getEmojiMap(int EmotionType){
        ArrayMap EmojiMap = null;
        switch (EmotionType) {
            case EMOTION_CLASSIC_TYPE:
                EmojiMap =  EMOTION_CLASSIC_MAP;
                break;
            default:
                EmojiMap = EMPTY_MAP;
                break;
        }

        return EmojiMap;
    }

//
//    public static int[] emoticons = new int[] {
//            R.drawable.emo_1, R.drawable.emo_2, R.drawable.emo_3, R.drawable.emo_4, R.drawable.emo_5,
//            R.drawable.emo_6, R.drawable.emo_7, R.drawable.emo_8, R.drawable.emo_9, R.drawable.emo_10,
//            R.drawable.emo_11, R.drawable.emo_12, R.drawable.emo_13, R.drawable.emo_14, R.drawable.emo_15,
//            R.drawable.emo_16, R.drawable.emo_17, R.drawable.emo_18, R.drawable.emo_19, R.drawable.emo_20,
//            R.drawable.emo_21, R.drawable.emo_22, R.drawable.emo_23, R.drawable.emo_24, R.drawable.emo_25,
//            R.drawable.emo_26, R.drawable.emo_27, R.drawable.emo_28, R.drawable.emo_29, R.drawable.emo_30,
//            R.drawable.emo_31, R.drawable.emo_32, R.drawable.emo_33, R.drawable.emo_34, R.drawable.emo_35,
//            R.drawable.emo_36, R.drawable.emo_37, R.drawable.emo_38, R.drawable.emo_39, R.drawable.emo_40,
//            R.drawable.emo_41, R.drawable.emo_42, R.drawable.emo_43, R.drawable.emo_44, R.drawable.emo_45,
//            R.drawable.emo_46, R.drawable.emo_47, R.drawable.emo_48, R.drawable.emo_49, R.drawable.emo_50,
//            R.drawable.emo_51, R.drawable.emo_52, R.drawable.emo_53, R.drawable.emo_54, R.drawable.emo_55,
//            R.drawable.emo_56, R.drawable.emo_57, R.drawable.emo_58, R.drawable.emo_59, R.drawable.emo_60,
//            R.drawable.emo_61, R.drawable.emo_62, R.drawable.emo_63, R.drawable.emo_64, R.drawable.emo_65,
//            R.drawable.emo_66, R.drawable.emo_67, R.drawable.emo_68, R.drawable.emo_69, R.drawable.emo_70,
//            R.drawable.emo_71, R.drawable.emo_72, R.drawable.emo_73, R.drawable.emo_74, R.drawable.emo_75,
//            R.drawable.emo_76, R.drawable.emo_77, R.drawable.emo_78, R.drawable.emo_79, R.drawable.emo_80,
//            R.drawable.emo_81, R.drawable.emo_82, R.drawable.emo_83, R.drawable.emo_84, R.drawable.emo_85,
//            R.drawable.emo_86, R.drawable.emo_87, R.drawable.emo_88, R.drawable.emo_89, R.drawable.emo_90,
//            R.drawable.emo_91, R.drawable.emo_92, R.drawable.emo_93, R.drawable.emo_94, R.drawable.emo_95,
//            R.drawable.emo_96, R.drawable.emo_97, R.drawable.emo_98, R.drawable.emo_99, R.drawable.emo_100,
//            R.drawable.emo_101, R.drawable.emo_102, R.drawable.emo_103, R.drawable.emo_104, R.drawable.emo_105,
//            R.drawable.emo_106, R.drawable.emo_107, R.drawable.emo_108, R.drawable.emo_109, R.drawable.emo_110,
//            R.drawable.emo_111, R.drawable.emo_112, R.drawable.emo_113
//    };
//
//    public static String[] emoticons_name = new String[]{
//            "emo_1","emo_2","emo_3","emo_4","emo_5","emo_6","emo_7","emo_8","emo_9","emo_10",
//            "emo_21","emo_22","emo_23","emo_24","emo_25","emo_26","emo_27","emo_28","emo_29","emo_30",
//            "emo_31","emo_32","emo_33","emo_34","emo_35","emo_36","emo_37","emo_38","emo_39","emo_40",
//            "emo_41","emo_42","emo_43","emo_44","emo_45","emo_46","emo_47","emo_48","emo_49","emo_50",
//            "emo_51","emo_52","emo_53","emo_54","emo_55","emo_56","emo_57","emo_58","emo_59","emo_60",
//            "emo_61","emo_62","emo_63","emo_64","emo_65","emo_66","emo_67","emo_68","emo_69","emo_70",
//            "emo_71","emo_72","emo_73","emo_74","emo_75","emo_76","emo_77","emo_78","emo_79","emo_80",
//            "emo_81","emo_82","emo_83","emo_84","emo_85","emo_86","emo_87","emo_88","emo_89","emo_90",
//            "emo_91","emo_92","emo_93","emo_94","emo_95","emo_96","emo_97","emo_98","emo_99","emo_100",
//            "emo_101","emo_102","emo_103","emo_104","emo_105","emo_106","emo_107","emo_108","emo_109","emo_110",
//            "emo_111","emo_112","emo_113"
//    };
//
//    public static SpannableString getSpanableString(Context context,String name) throws Exception{
//        String html = "<img src='" + name + "'/>";
//
//
//        return null;
//    }

}
