package uz.coder.muslimuz.fargment;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import uz.coder.muslimuz.R;
import uz.coder.muslimuz.adapter.AlAsmaUlHusnaAdapter;
import uz.coder.muslimuz.databinding.FragmentAlAsmaAlHusnaBinding;
import uz.coder.muslimuz.model.AlAsmaAlHusnaModel;
import uz.coder.muslimuz.ui.ItemActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AlAsmaAlHusnaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AlAsmaAlHusnaFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private static final String TAG = "AlAsmaAlHusnaFragment";
    public AlAsmaAlHusnaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AlAsmaAlHusnaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AlAsmaAlHusnaFragment newInstance(String param1, String param2) {
        AlAsmaAlHusnaFragment fragment = new AlAsmaAlHusnaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    private FragmentAlAsmaAlHusnaBinding binding;
    private List<AlAsmaAlHusnaModel> alAsmaAlHusnaModelList;
    private AlAsmaUlHusnaAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentAlAsmaAlHusnaBinding.inflate(inflater, container, false);
        loadData();
        adapter = new AlAsmaUlHusnaAdapter(alAsmaAlHusnaModelList, (alAsmaAlHusnaModel, pozition) -> {
            String name = alAsmaAlHusnaModelList.get(pozition).getName();
            String messege = alAsmaAlHusnaModelList.get(pozition).getMessege();
            Log.d(TAG, "onClik: "+name +" "+messege );
            Intent intent = new Intent(getContext(),ItemActivity.class);
            intent.putExtra("name",name);
            intent.putExtra("message",messege);
            startActivity(intent);
        });
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        binding.rvAlAsmaAlHusna.setLayoutManager(layoutManager);
        binding.rvAlAsmaAlHusna.setAdapter(adapter);
        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void loadData() {
        alAsmaAlHusnaModelList = new ArrayList<>();
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(1, "Olloh", "O‘z sifatida, zotida yagona, ibodat qilish uchun eng munosib, undan boshqa iloh yo‘q Zot"));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(2, "Ar-Rahmon", "O‘ta Mehribon, karamli, barcha maxluqotlarga, jumladan, kofirga ham, mo‘minga ham rizq beruvchi Zot"));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(3, "Ar-Rahim", "Mehribon, Rahmli, qiyomat kuni faqat mo‘minlarga rahm qiluvchi, Haqiqiy imon keltirganlar gunohini avf qilib, jannatga kirituvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(4, "Al-Malik", "Barcha mulklarning haqiqiy Egasi, Undan o‘zga ega yo‘q. Alloh xohlagan ishini qila oladi, xohlagan narsasini yaratishi mumkin."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(5, "Al-Quddus", "Har qanday ayb-nuqsondan pok, mukammal Zot. Mutlaq muqaddaslik faqat Allohga xos."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(6, "As-Salom", "Nuqsonlardan salomat, pok, bandalarini halokatlardan saqlovchi, ularga omonlik, xotirjamlik beruvchi"));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(7, "Al-Moʻmin", "Dunyoda istalgan bandasiga, oxiratda jahannam o‘tidan faqat mo‘minlarga omonlik beruvchi omonatga vafo qiluvchi, bandalariga jannat haqida bashorat berib, qiyomat kuni buning tasdig‘i o‘laroq ularni jannatga kirituvchi Zot."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(8, "Al-Muhaymin", "Barcha narsani kuzatib turuvchi, maxluqotlarni himoya qiluvchi, ularning har bir holatini bilib\n" +
                "\n" +
                "turuvchi; har bir narsaga shohid bo‘luvchi; maxluqotlar ishini tadbir qiluvchi; amin, ishonchli,\n" +
                "\n" +
                "vaʼdasiga vafo qiluvchi.\n" +
                "\n"));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(9, "Al-Aziz", "Kuch-quvvat Egasi, hech qachon mag‘lub bo‘lmaydigan; barcha narsadan g‘olib keluvchi.\n" +
                "\n"));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(10, "Al-Jabbor", "Maxluqotlari ustidan mutlaq G‘olib, ularga O‘zi xohlagan amr-qaytariqlarni joriy qiluvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(11, "Al-Mutakabbir", "Ulug‘, Aziz, kibriyo Egasi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(12, "Al-Xoliq", "Avval yo‘q bo‘lgan narsalarni Yaratuvchi, har bir narsani aniq o‘lchov bilan xalq qiluvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(13, "Al-Bori", "Yo‘qdan bor qiluvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(14, "Al-Musavvir", "Har bir maxluqotiga o‘ziga yarasha, o‘zga maxluqotlardan ajralib turadigan darajada surat beruvchi;\n" +
                "\n" +
                "bandalariga onalari qornida turgan hollarida O‘zi xohlagan tarzda shakl beruvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(15, "Al-G‘affor", "Haqiqiy tavba qiluvchi bandalari xato-kamchiliklarini, gunohlarini doim kechiruvchi,\n" +
                "\n" +
                "nuqsonlarini berkituvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(16, "Al-Qahhor", "Barcha maxluqotlaridan ustun, ularga O‘zining adolatli hukmini yurgizuvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(17, "Al-Vahhob", "Bandalariga evazni niyat qilmagan holda juda ko‘p neʼmatlar beruvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(18, "Ar-Razzoq", "Rizqlarni yaratib, ularni maxluqotlariga yetkazuvchi, maxluqotlarini doim rizqlantirib turuvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(19, "Al-Fattoh", "Bandalariga rizq va rahmat eshiklarini ochuvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(20, "Al-Alim", "Barcha narsa va hodisalarning botiniy, zohiriy, eng nozik, eng katta jihatlarigacha Biluvchi, ilmi\n" +
                "\n" +
                "hamma narsani to‘liq qamrab olgan Zot."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(21, "Al-Qobiz", "O‘z hikmati bilan baʼzi bandalari rizqini tor qiluvchi, o‘lim chog‘ida bandalar ruhini oluvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(22, "Al-Bosit", "O‘z karami, rahmati bilan xohlagan bandasi rizqini keng qiluvchi, bandalar hayotlik chog‘ida\n" +
                "\n" +
                "jasadlari ichidagi ruhlarini qo‘yib yuboruvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(23, "Al-Xofiz", "Kofir, mushrik, osiy bandalar martabasini pasaytiruvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(24, "Ar-Rofi", "Mo‘min bandalari martabasini baland qiluvchi, avliyo bandalarini O‘ziga yaqinlashtiruvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(25, "Al-Muiz", "Xohlagan bandasini imon yo‘liga boshlab, aziz-mukarram qiluvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(26, "Al-Muzil", "\n" +
                "Bandalaridan kimni xohlasa, xor qiluvchi, ulardan azizlikni, mukarramlikni oluvchi.\n" +
                "\n"));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(27, "As-Sami", "Har bir narsani eshitib turuvchi. Bo‘layotgan har qanday voqea-hodisa Allohning eshitishidan,\n" +
                "\n" +
                "ilmidan xoli emas."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(28, "Al-Basir", "Har bir narsani ko‘rib turuvchi, bo‘layotgan har qanday holat Allohning ko‘rishidan chetda qolmaydi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(29, "Al-Hakam", "Mutlaq Hokim. Hech kim Allohning hukmiga eʼtiroz bildirib, qarshilik ko‘rsata olmaydi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(30, "Al-Adl", "Adolatli, mutlaq adolat qiluvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(31, "Al-Latif", "Lutf ko‘rsatuvchi, karamli, muloyim, mehribon; har bir narsaning o‘ta nozik jihatlarigacha bilib\n" +
                "\n" +
                "turuvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(32, "Al-Xabir", "Har bir narsaning zohiriy (tashqi), botiniy (ichki) jihatlaridan xabardor Zot."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(33, "Al-Halim", "Bandalari isyoniga tezda g‘azab qilmaydigan, ularga imkon beruvchi, osiy bandalariga azob berishga\n" +
                "\n" +
                "shoshilmaydigan, faqat mavridi kelgandagina jazolovchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(34, "Al-Azim", "Inson aqli, tafakkuri tasavvur qila olmaydigan darajada ulug‘ Zot."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(35, "Al-G‘afur", "Bandalar gunohlarini kechirib, ayb-kamchiliklarini berkituvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(36, "Ash-Shakur", "Itoatkor, solih amallar qiluvchi bandalariga nihoyatda ko‘p mukofot beruvchi, oz amal qiluvchi\n" +
                "\n" +
                "bandalariga ham niyatlariga, ixloslariga yarasha ajr-savob beruvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(37, "Al-Aliy", "Juda oliy martabali; Uning zotini, sifatini tasavvur qilishga aqllar ojizlik qiladi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(38, "Al-Kabir", "O‘ta ulug‘, maxluqotlaridan mutlaq ustun, azaliy, abadiy Zot."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(39, "Al-Hafiz", "Maxluqotlarini O‘zi xohlagan muddat halokatdan saqlab turuvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(40, "Al-Muqit", "“Al-Muqit” sifatining birinchi maʼnosi “Al-Hafiz”niki bilan bir xil. Ikkinchi maʼnosi esa\n" +
                "\n" +
                "har bir maxluqotiga o‘z nasibasini beruvchidir."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(41, "Al-Hasib", "Kifoya qiluvchi, maxluqotlarini kifoya qiladigan darajada rizqlantiruvchi, qiyomat kuni\n" +
                "\n" +
                "bandalarini hisob qiluvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(42, "Al-Jalil", "Ulug‘lik sifatini o‘zida jamlagan Zot; buyuk, ulug‘, oliy."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(43, "Al-Karim", "Karami, saxovati cheksiz Zot. Inʼom qilish bilan Allohning xazinasi kamayib qolmaydi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(44, "Ar-Raqib", "Har bir narsani kuzatib turuvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(45, "Al-Mujib", "Bandalar ixlos bilan qilgan duolarini ijobat etuvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(46, "Al-Vosiʼ", "Rahmati barcha narsadan keng, xohlagan bandasi rizqini kengaytiruvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(47, "Al-Hakim", "Har bir tadbirini hikmat bilan amalga oshiruvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(48, "Al-Vadud", "O‘zining solih bandalarini yaxshi ko‘ruvchi, ulardan rozi bo‘luvchi, bandalari tomonidan seviluvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(49, "Al-Majid", "Shuhrati nihoyatda cheksiz, qadri juda baland; karamining cheki yo‘q, o‘ta saxiy Zot."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(50, "Al-Bois", "Mazkur sifatning ikki xil maʼnosi bor: 1. Tiriltiruvchi. 2. Yuboruvchi.\n" +
                "\n" +
                "Yaʼni, bandalariga payg‘ambarlar yuboruvchi, barcha maxluqotlarini qiyomat kuni qayta\n" +
                "\n" +
                "tiriltiruvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(51, "Ash-Shahid", "Bo‘layotgan har bir narsa, hodisa ustida hozir-shohid bo‘lib turuvchi. Biron narsa Allohning\n" +
                "\n" +
                "guvohligidan chetda qolmaydi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(52, "Al-Haq", "Mavjudligi haqiqatan tasdiqlangan, Haq, Haqni yuzaga chiqaruvchi Zot."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(53, "Al-Vakil", "Bandalari ishlarini amalga oshiruvchi, ularga manfaat yetkazishga kafil Zot."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(54, "Al-Qaviy", "Kuch-quvvat Egasi, biron amalni bajarishdan ojiz qolmaydigan Zot. Alloh mutlaq qudrat\n" +
                "\n" +
                "Sohibidir."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(55, "Al-Matin", "O‘ta quvvatli, matonatli Zot. Biron ishni amalga oshirgach, Alloh charchamaydi, zaiflashib\n" +
                "\n" +
                "qolmaydi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(56, "Al-Valiy", "Yordam beruvchi; valiy bandalarini yaxshi ko‘ruvchi; butun olamdagi maxluqotlari ishlarini\n" +
                "\n" +
                "boshqarib turuvchi Zot."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(57, "Al-Hamid", "Har qanday holatda, har qanday zamonda hamdu sanoga eng munosib, bandalari tomonidan tinimsiz\n" +
                "\n" +
                "maqtaladigan Zot."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(58, "Al-Muhsiy", "Har bir narsani O‘z ilmi bilan hisobga oluvchi, ilmi barcha narsani qamragan, har bir narsaning\n" +
                "\n" +
                "eng nozik jihatlarini ham, eʼtiborga molik tomonlarini ham inobatga oluvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(59, "Al-Mubdiʼ", "Har bir narsani o‘xshashi yo‘q darajada avvaldan Yaratuvchi, yo‘qdan bor qiluvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(60, "Al-Muid", "Maxluqotlarini o‘limga qaytaruvchi (yaʼni, o‘ldiruvchi), so‘ng qiyomat kuni ularni yana hayotga\n" +
                "\n" +
                "qaytaruvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(61, "Al-Muhyi", "Qiyomatda o‘liklarni qayta tiriltiruvchi, ularga jon ato etuvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(62, "Al-Mumit", "O‘limni yaratuvchi, xohlagan bandasi jonini xohlagan vaqtida oluvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(63, "Al-Hay", "Doim tirik, hech qachon o‘lmaydigan Zot.\n" +
                "\n" +
                "Boqiylik faqat U Zotga xos. O‘lim, foniylik esa maxluqotlarga xos. Bunday sifatlar Allohga\n" +
                "\n" +
                "nisbat berilmaydi. Alloh barhayotligi bandalar tirikligidan tubdan farq qiladi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(64, "Al-Qayyum", "O‘z-o‘zidan qoim bo‘luvchi, boshqalarni ham qoim qiluvchi, har bir narsa ustida guvoh bo‘luvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(65, "Al-Vojid", "Xohlagan narsasini xohlagan vaqtida topuvchi, hech qachon faqir bo‘lmaydigan darajada boy Zot."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(66, "Al-Mojid", "Shon-shuhrat Egasi, qadri baland, karamli, saxiy Zot."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(67, "Al-Vohid", "Yagona, Yolg‘iz, sherigi yo‘q Zot.\n" +
                "\n" +
                "Alloh taoloning azalda ham sherigi bo‘lmagan, bundan keyin ham bo‘lmaydi. U Zot o‘z sifatida,\n" +
                "\n" +
                "zotida, ilohlikda, ibodatga munosiblikda Yakkayu Yagonadir."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(68, "As-Somad.", "Mazkur sifat bir necha maʼnolarni anglatadi. Jumladan, “mutlaq Hokim”, “doim barhayot\n" +
                "\n" +
                "turuvchi”, “hech kimga hojati tushmaydigan, aksincha maxluqotlari hojatini ravo qiluvchi Zot”."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(69, "Al-Qodir", "Har bir narsaga qodir Zot. Alloh xohlagan ishini qilishdan ojiz emas. Har qanday ish Unga oson."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(70, "Al-Muqtadir", "Qudrati cheksiz, nihoyatda kuchli Zot."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(71, "Al-Muqaddim", "Xohlagan narsasini oldinga surib, ularni o‘z joyiga qo‘yuvchi. Kim yoki nima oldinga surilishga\n" +
                "\n" +
                "munosib bo‘lsa, oldinga suradi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(72, "Al-Muaxxir", "Xohlagan narsasini ortga surib, ularni o‘z joyiga qo‘yuvchi. Kim yoki nima ortga surilishga\n" +
                "\n" +
                "munosib bo‘lsa, ortga suradi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(73, "Al-Avval", "Boshlanishining avvali yo‘q, barcha narsadan avval bo‘lgan Zot.\n" +
                "\n" +
                "Alloh taolo maxluqotlar yaratilmasidan oldin ham mavjud edi. Dunyodagi barcha narsalar,\n" +
                "\n" +
                "mavjudotlar “Al-Avval” sifatli Alloh tomonidan yaratilgan."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(74, "Al-Oxir", "Maxluqotlar o‘lib ketganidan so‘ng ham boqiy qoluvchi, hech qachon o‘lmaydigan, mavjudligining\n" +
                "\n" +
                "oxiri yo‘q Zot."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(75, "Az-Zohir", "Barcha narsadan ustun, oliy Zot. Atrof-muhitdagi narsalar, holatlar Allohning zohirligiga\n" +
                "\n" +
                "dalolat qiladi.\n" +
                "\n" +
                "Haqiqatan, aql yuritgan kishi Allohning borligini, Yakkayu Yagonaligini biladi. Zero, U Zotning\n" +
                "\n" +
                "mavjudligi ochiq-oydin ko‘rinib turadi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(76, "Al-Botin", "Maxluqotlar nazaridan berkingan, ularga ko‘rinmaydigan Zot. Chunonchi, ko‘z bilan Allohni bu\n" +
                "\n" +
                "dunyoda ko‘rib bo‘lmaydi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(77, "Al-Voliy", "Barcha narsaning Egasi, ularni tasarruf etuvchi Zot."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(78, "Al-Mutaoliy", "Kofirlar U Zotga nisbatan ayb taqashlaridan, mo‘minlar hamdu sanolaridan oliy Zot.\n" +
                "\n" +
                "Yaʼni, kofir va mushriklarning Alloh taologa nisbatan noloyiq tuhmatlari U Zot shaʼniga putur\n" +
                "\n" +
                "yetkazmaydi. Mo‘minlar hamdu sanolari esa U Zot ulug‘ligini ziyoda qilmaydi. Chunonchi, bandalari\n" +
                "\n" +
                "tuhmatlari, hamdu sanolari Alloh taologa zarar ham, foyda ham keltirmaydi. U Zot bandalari\n" +
                "\n" +
                "qiladigan amallaridan, aytadigan gaplaridan Oliy va Behojatdir."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(79, "Al-Bar", "Bandalariga cheksiz yaxshiliklar qiluvchi, lutf-karami, ehsonining cheki yo‘q Zot."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(80, "At-Tavvob", "Bandalari ixlos bilan qilgan tavbalarini qabul qiluvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(81, "Al-Muntaqim", "G‘azabini qo‘zg‘agan bandalaridan intiqom (qasos) oluvchi, ularni jazolovchi. Lekin Allohning\n" +
                "\n" +
                "jazolashi zulm emas, adolatdir."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(82, "Al-Afuv", "Bandalari gunohlarini kechirib yuboruvchi.\n" +
                "\n" +
                "Mazkur sifat maʼnosi “Al-G‘afur”nikidan ham kuchliroq. Zero “Al-G‘afur” bandalar gunohlarini\n" +
                "\n" +
                "berkitishni, “Al-Afuv” gunohlarni kechirishni, o‘chirib yuborishni anglatadi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(83, "Ar-Rauf", "O‘ta Mehribon, nihoyatda Shafqatli, Rahmli Zot."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(84, "Molikul mulk", "Mulk egasi, ishlarni O‘zi xohlagan tarzda amalga oshiradi, Uning hukmiga qarshi boruvchi yo‘q,\n" +
                "\n" +
                "mutlaq tasarruf qiluvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(85, "Zul jaloli val ikrom", "Ulug‘lik va karam Egasi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(86, "Al-Muqsit", "Adolatli Zot.\n" +
                "\n" +
                "Alloh O‘z hukmida, jazo berishida, mahrum etishida adolatlidir. Bandalariga zulm qilmaydi,\n" +
                "\n" +
                "ularni gunohlariga yarasha jazolaydi, yaxshi ishlarini munosib taqdirlaydi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(87, "Al-Jomiʼ", "Maxluqotlarni hisob qilish uchun qiyomat kuni mahshargohga Jamlovchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(88, "Al-G‘aniy", "Boy, Behojat Zot. Boshqalarning Allohga hojati tushadi, biroq Alloh hech kimga, hech narsaga\n" +
                "\n" +
                "muhtoj emas."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(89, "Al-Mug‘niy", "Behojat-boy qiluvchi.\n" +
                "\n" +
                "Alloh bandalari orasidan kimni xohlasa, o‘shani boy-behojat qilib qo‘yadi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(90, "Al-Moniʼ", "O‘ziga itoat etuvchi mo‘min bandalarini har xil kulfatlardan, qiyinchiliklardan asrovchi, ularni\n" +
                "\n" +
                "balolardan qutqaruvchi; xohlagan bandasidan keng rizqni man qiluvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(91, "Az-Zor", "Zararli narsalarni ham yaratuvchi.\n" +
                "\n" +
                "Alloh yaxshini ham, yomonni ham, foydalini ham, zararlini ham yaratadi. Shu orqali xohlagan\n" +
                "\n" +
                "maxluqotiga O‘z hikmati bilan zarar yetkazadi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(92, "An-Nofiʼ", "Xohlagan bandasiga manfaat keltiruvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(93, "An-Nur", "Ko‘zi ojizlar Allohning nuri bilan ko‘radi. Maʼnaviy so‘qirlar Uning hidoyati ila to‘g‘ri yo‘lni\n" +
                "\n" +
                "topadi. Alloh O‘zi zohir bo‘luvchi, o‘zgalarni ham zohir qiluvchi Zotdir. U osmonlar va Yerning nuridir."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(94, "Al-Hodiy", "Xohlagan bandasini to‘g‘ri yo‘lga yo‘llovchi, hidoyatga boshlovchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(95, "Al-Badiʼ", "Mislsiz narsalarni yo‘qdan bor qiluvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(96, "Al-Boqiy", "Doim boqiy turuvchi, foniylik sifatidan xoli."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(97, "Al-Voris", "Barcha maxluqotlar o‘lib ketganidan keyin ham mangu qoluvchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(98, "Ar-Rashid", "Xohlagan bandasini to‘g‘ri yo‘lga boshlovchi."));
        alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(99, "As-Sabur", "O‘ta sabrli Zot.\n" +
                "\n" +
                "Alloh gunohkorlarni jazolashga shoshilmaydi, balki hidoyat yo‘liga yurib, o‘zlarini isloh\n" +
                "\n" +
                "qilishlariga imkon beradi."));


    }
}