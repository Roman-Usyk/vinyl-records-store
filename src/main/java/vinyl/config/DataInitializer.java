package vinyl.config;

import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vinyl.model.Record;
import vinyl.model.Song;
import vinyl.service.RecordService;
import vinyl.service.SongService;

@Component
public class DataInitializer {
    private final SongService songService;
    private final RecordService recordService;

    @Autowired
    public DataInitializer(SongService songService,
                           RecordService recordService) {
        this.songService = songService;
        this.recordService = recordService;
    }

    @PostConstruct
    public void inject() {

        //  1. Tame Impala record

        Song songTameImpalaFirst = new Song();
        songTameImpalaFirst.setTitle("Let It Happen");

        Song songTameImpalaSecond = new Song();
        songTameImpalaSecond.setTitle("Nangs");

        Song songTameImpalaThird = new Song();
        songTameImpalaThird.setTitle("The Moment");

        Song songTameImpalaFourth = new Song();
        songTameImpalaFourth.setTitle("Yes I'm Changing");

        Song songTameImpalaFifth = new Song();
        songTameImpalaFifth.setTitle("Eventually");

        Song songTameImpalaSixth = new Song();
        songTameImpalaSixth.setTitle("Gossip");

        Song songTameImpalaSeventh = new Song();
        songTameImpalaSeventh.setTitle("The Less I Know The Better");

        Song songTameImpalaEighth = new Song();
        songTameImpalaEighth.setTitle("Past Life");

        Song songTameImpalaNinth = new Song();
        songTameImpalaNinth.setTitle("Disciples");

        Song songTameImpalaTenth = new Song();
        songTameImpalaTenth.setTitle("'Cause I'm A Man");

        Song songTameImpalaEleventh = new Song();
        songTameImpalaEleventh.setTitle("Reality In Motion");

        Song songTameImpalaTwelfth = new Song();
        songTameImpalaTwelfth.setTitle("Love/Paranoia");

        Song songTameImpalaThirteenth = new Song();
        songTameImpalaThirteenth.setTitle("New Person, Same Old Mistakes");

        songService.add(songTameImpalaFirst);
        songService.add(songTameImpalaSecond);
        songService.add(songTameImpalaThird);
        songService.add(songTameImpalaFourth);
        songService.add(songTameImpalaFifth);
        songService.add(songTameImpalaSixth);
        songService.add(songTameImpalaSeventh);
        songService.add(songTameImpalaEighth);
        songService.add(songTameImpalaNinth);
        songService.add(songTameImpalaTenth);
        songService.add(songTameImpalaEleventh);
        songService.add(songTameImpalaTwelfth);
        songService.add(songTameImpalaThirteenth);

        Record recordTameImpala = new Record();
        recordTameImpala.setPerformer("Tame Impala");
        recordTameImpala.setTitleAlbum("Currents");
        recordTameImpala.setGenre("Indie");
        recordTameImpala.setYear("2015");
        recordTameImpala.setCountry("Holland");
        recordTameImpala.setLabel("Universal");
        recordTameImpala.setSongList(List.of(songTameImpalaFirst, songTameImpalaSecond,
                songTameImpalaThird, songTameImpalaFourth, songTameImpalaFifth,
                songTameImpalaSixth, songTameImpalaSeventh, songTameImpalaEighth,
                songTameImpalaNinth, songTameImpalaTenth, songTameImpalaEleventh,
                songTameImpalaTwelfth, songTameImpalaThirteenth));
        recordTameImpala.setPrice(1260.0);
        recordTameImpala.setDiscount(1199.0);
        recordTameImpala.setPictureUrl("https://i.ibb.co/vdth5C0/1-Tame-Impala-Currents.jpg");
        recordTameImpala.setFormat("2 LP");
        recordTameImpala.setColor("Black 180gr Vinyl");

        recordService.add(recordTameImpala);

        // 2. King Gizzard And The Lizard Wizard record

        Song songKingGizzardAndTheLizardWizardFirst = new Song();
        songKingGizzardAndTheLizardWizardFirst.setTitle("Planet B");

        Song songKingGizzardAndTheLizardWizardSecond = new Song();
        songKingGizzardAndTheLizardWizardSecond.setTitle("Mars For The Rich");

        Song songKingGizzardAndTheLizardWizardThird = new Song();
        songKingGizzardAndTheLizardWizardThird.setTitle("Organ Farmer");

        Song songKingGizzardAndTheLizardWizardFourth = new Song();
        songKingGizzardAndTheLizardWizardFourth.setTitle("Superbug");

        Song songKingGizzardAndTheLizardWizardFifth = new Song();
        songKingGizzardAndTheLizardWizardFifth.setTitle("Venusian 1");

        Song songKingGizzardAndTheLizardWizardSixth = new Song();
        songKingGizzardAndTheLizardWizardSixth.setTitle("Perihelion ");

        Song songKingGizzardAndTheLizardWizardSeventh = new Song();
        songKingGizzardAndTheLizardWizardSeventh.setTitle("Venusian 2");

        Song songKingGizzardAndTheLizardWizardEighth = new Song();
        songKingGizzardAndTheLizardWizardEighth.setTitle("Self-Immolate");

        Song songKingGizzardAndTheLizardWizardNinth = new Song();
        songKingGizzardAndTheLizardWizardNinth.setTitle("Hell");

        songService.add(songKingGizzardAndTheLizardWizardFirst);
        songService.add(songKingGizzardAndTheLizardWizardSecond);
        songService.add(songKingGizzardAndTheLizardWizardThird);
        songService.add(songKingGizzardAndTheLizardWizardFourth);
        songService.add(songKingGizzardAndTheLizardWizardFifth);
        songService.add(songKingGizzardAndTheLizardWizardSixth);
        songService.add(songKingGizzardAndTheLizardWizardSeventh);
        songService.add(songKingGizzardAndTheLizardWizardEighth);
        songService.add(songKingGizzardAndTheLizardWizardNinth);

        Record recordKingGizzardAndTheLizardWizard = new Record();
        recordKingGizzardAndTheLizardWizard
                .setPerformer("King Gizzard And The Lizard Wizard");
        recordKingGizzardAndTheLizardWizard
                .setTitleAlbum("Infest The Rats' Nest (Live)");
        recordKingGizzardAndTheLizardWizard.setGenre("Rock");
        recordKingGizzardAndTheLizardWizard.setYear("2022");
        recordKingGizzardAndTheLizardWizard.setCountry("Holland");
        recordKingGizzardAndTheLizardWizard.setLabel("Fuzz Club");
        recordKingGizzardAndTheLizardWizard
                .setSongList(List.of(songKingGizzardAndTheLizardWizardFirst,
                        songKingGizzardAndTheLizardWizardSecond,
                        songKingGizzardAndTheLizardWizardThird,
                        songKingGizzardAndTheLizardWizardFourth,
                        songKingGizzardAndTheLizardWizardFifth,
                        songKingGizzardAndTheLizardWizardSixth,
                        songKingGizzardAndTheLizardWizardSeventh,
                        songKingGizzardAndTheLizardWizardEighth,
                        songKingGizzardAndTheLizardWizardNinth));
        recordKingGizzardAndTheLizardWizard.setPrice(1380.0);
        recordKingGizzardAndTheLizardWizard.setDiscount(1360.0);
        recordKingGizzardAndTheLizardWizard.setPictureUrl("https://i.ibb.co/Chzf8FT/"
                + "2-King-Gizzard-And-The-Lizard-Wizard-Infest-The-Rats-Nest-Live.jpg");
        recordKingGizzardAndTheLizardWizard.setFormat("1 LP");
        recordKingGizzardAndTheLizardWizard.setColor("White Vinyl Edition");

        recordService.add(recordKingGizzardAndTheLizardWizard);

        // 3. She & Him record

        Song songSheAndHimFirst = new Song();
        songSheAndHimFirst.setTitle("Sentimental Heart");

        Song songSheAndHimSecond = new Song();
        songSheAndHimSecond.setTitle("Why Do You Let Me Stay Here?");

        Song songSheAndHimThird = new Song();
        songSheAndHimThird.setTitle("This Is Not A Test");

        Song songSheAndHimFourth = new Song();
        songSheAndHimFourth.setTitle("Change Is Hard");

        Song songSheAndHimFifth = new Song();
        songSheAndHimFifth.setTitle("I Thought I Saw Your Face Today");

        Song songSheAndHimSixth = new Song();
        songSheAndHimSixth.setTitle("Take It Back");

        Song songSheAndHimSeventh = new Song();
        songSheAndHimSeventh.setTitle("I Was Made For You");

        Song songSheAndHimEighth = new Song();
        songSheAndHimEighth.setTitle("You Really Got A Hold On Me");

        Song songSheAndHimNinth = new Song();
        songSheAndHimNinth.setTitle("Sweet Darlin'");

        Song songSheAndHimTenth = new Song();
        songSheAndHimTenth.setTitle("Black Hole");

        Song songSheAndHimEleventh = new Song();
        songSheAndHimEleventh.setTitle("Got Me");

        Song songSheAndHimTwelfth = new Song();
        songSheAndHimTwelfth.setTitle("I Should Have Known Better");

        Song songSheAndHimThirteenth = new Song();
        songSheAndHimThirteenth.setTitle("Swing Low, Sweet Chariot");

        songService.add(songSheAndHimFirst);
        songService.add(songSheAndHimSecond);
        songService.add(songSheAndHimThird);
        songService.add(songSheAndHimFourth);
        songService.add(songSheAndHimFifth);
        songService.add(songSheAndHimSixth);
        songService.add(songSheAndHimSeventh);
        songService.add(songSheAndHimEighth);
        songService.add(songSheAndHimNinth);
        songService.add(songSheAndHimTenth);
        songService.add(songSheAndHimEleventh);
        songService.add(songSheAndHimTwelfth);
        songService.add(songSheAndHimThirteenth);

        Record recordSheAndHim = new Record();
        recordSheAndHim.setPerformer("She And Him");
        recordSheAndHim.setTitleAlbum("Volume One");
        recordSheAndHim.setGenre("Rock, Folk, World, & Country");
        recordSheAndHim.setYear("2008");
        recordSheAndHim.setCountry("Brazil");
        recordSheAndHim.setLabel("Selecta – MBB20028");
        recordSheAndHim.setSongList(List.of(songSheAndHimFirst, songSheAndHimSecond,
                songSheAndHimThird, songSheAndHimFourth, songSheAndHimFifth,
                songSheAndHimSixth, songSheAndHimSeventh, songSheAndHimEighth,
                songSheAndHimNinth, songSheAndHimTenth, songSheAndHimEleventh,
                songSheAndHimTwelfth, songSheAndHimThirteenth));
        recordSheAndHim.setPrice(2222.0);
        recordSheAndHim.setDiscount(2020.0);
        recordSheAndHim.setPictureUrl("https://i.ibb.co/nb3DhtH/3-She-And-Him-Volume-One.jpg");
        recordSheAndHim.setFormat("1 LP");
        recordSheAndHim.setColor("Black 180gr Vinyl");

        recordService.add(recordSheAndHim);

        // 4. Original Soundtrack record

        Song songOriginalSoundtrackFirst = new Song();
        songOriginalSoundtrackFirst.setTitle("R.e.m. - All The Right Friends");

        Song songOriginalSoundtrackSecond = new Song();
        songOriginalSoundtrackSecond.setTitle("Radiohead - Everything In Its Right Place");

        Song songOriginalSoundtrackThird = new Song();
        songOriginalSoundtrackThird.setTitle("Paul Mccartney - Vanilla Sky");

        Song songOriginalSoundtrackFourth = new Song();
        songOriginalSoundtrackFourth.setTitle("Peter Gabriel - Solsbury Hill");

        Song songOriginalSoundtrackFifth = new Song();
        songOriginalSoundtrackFifth.setTitle("Julianna Gianni - I Fall Apart");

        Song songOriginalSoundtrackSixth = new Song();
        songOriginalSoundtrackSixth
                .setTitle("The Monkees - Porpoise Song (theme From \"head\")");

        Song songOriginalSoundtrackSeventh = new Song();
        songOriginalSoundtrackSeventh
                .setTitle("Looper Featuring Francis Macdonald - Mondo '77");

        Song songOriginalSoundtrackEighth = new Song();
        songOriginalSoundtrackEighth.setTitle("Red House Painters - Have You Forgotten");

        Song songOriginalSoundtrackNinth = new Song();
        songOriginalSoundtrackNinth.setTitle("Josh Rouse - Directions");

        Song songOriginalSoundtrackTenth = new Song();
        songOriginalSoundtrackTenth.setTitle("Leftfield/afrika Bambaataa - Afrika Shox");

        Song songOriginalSoundtrackEleventh = new Song();
        songOriginalSoundtrackEleventh.setTitle("Sigur Ros - Svefn-g-englar");

        Song songOriginalSoundtrackTwelfth = new Song();
        songOriginalSoundtrackTwelfth.setTitle("Jeff Buckley - Last Goodbye");

        Song songOriginalSoundtrackThirteenth = new Song();
        songOriginalSoundtrackThirteenth.setTitle("Todd Rundgren - Can We Still Be Friends");

        Song songOriginalSoundtrackFourteenth = new Song();
        songOriginalSoundtrackFourteenth.setTitle("Bob Dylan - Fourth Time Around");

        Song songOriginalSoundtrackFifteenth = new Song();
        songOriginalSoundtrackFifteenth.setTitle("Nancy Wilson - Elevator Beat");

        Song songOriginalSoundtrackSixteenth = new Song();
        songOriginalSoundtrackSixteenth.setTitle("R.e.m. - Sweetness Follows");

        Song songOriginalSoundtrackSeventeenth = new Song();
        songOriginalSoundtrackSeventeenth.setTitle("The Chemical Brothers - Where Do I Begin");

        songService.add(songOriginalSoundtrackFirst);
        songService.add(songOriginalSoundtrackSecond);
        songService.add(songOriginalSoundtrackThird);
        songService.add(songOriginalSoundtrackFourth);
        songService.add(songOriginalSoundtrackFifth);
        songService.add(songOriginalSoundtrackSixth);
        songService.add(songOriginalSoundtrackSeventh);
        songService.add(songOriginalSoundtrackEighth);
        songService.add(songOriginalSoundtrackNinth);
        songService.add(songOriginalSoundtrackTenth);
        songService.add(songOriginalSoundtrackEleventh);
        songService.add(songOriginalSoundtrackTwelfth);
        songService.add(songOriginalSoundtrackThirteenth);
        songService.add(songOriginalSoundtrackFourteenth);
        songService.add(songOriginalSoundtrackFifteenth);
        songService.add(songOriginalSoundtrackSixteenth);
        songService.add(songOriginalSoundtrackSeventeenth);

        Record recordOriginalSoundtrack = new Record();
        recordOriginalSoundtrack.setPerformer("Original Soundtrack");
        recordOriginalSoundtrack.setTitleAlbum("Vanilla Sky (Limited Edition)");
        recordOriginalSoundtrack.setGenre("Original Soundtrack");
        recordOriginalSoundtrack.setYear("2022");
        recordOriginalSoundtrack.setCountry("Holland");
        recordOriginalSoundtrack.setLabel("Real Gone Music");
        recordOriginalSoundtrack.setSongList(List.of(songOriginalSoundtrackFirst,
                songOriginalSoundtrackSecond, songOriginalSoundtrackThird,
                songOriginalSoundtrackFourth, songOriginalSoundtrackFifth,
                songOriginalSoundtrackSixth, songOriginalSoundtrackSeventh,
                songOriginalSoundtrackEighth, songOriginalSoundtrackNinth,
                songOriginalSoundtrackTenth, songOriginalSoundtrackEleventh,
                songOriginalSoundtrackTwelfth, songOriginalSoundtrackThirteenth,
                songOriginalSoundtrackFourteenth, songOriginalSoundtrackFifteenth,
                songOriginalSoundtrackSixteenth, songOriginalSoundtrackSeventeenth));
        recordOriginalSoundtrack.setPrice(2520.0);
        recordOriginalSoundtrack.setDiscount(2500.0);
        recordOriginalSoundtrack.setPictureUrl("https://i.ibb.co/Sr8fTGt/"
                + "4-Original-Soundtrack-Vinilla-Sky.jpg");
        recordOriginalSoundtrack.setFormat("2 LP");
        recordOriginalSoundtrack.setColor("Orange Swirl Edition");

        recordService.add(recordOriginalSoundtrack);

        // 5. Palace record

        Song songPalaceFirst = new Song();
        songPalaceFirst.setTitle("Never Said It Was Easy");

        Song songPalaceSecond = new Song();
        songPalaceSecond.setTitle("Shame On You");

        Song songPalaceThird = new Song();
        songPalaceThird.setTitle("Fade");

        Song songPalaceFourth = new Song();
        songPalaceFourth.setTitle("Gravity");

        Song songPalaceFifth = new Song();
        songPalaceFifth.setTitle("Give Me The Rain");

        Song songPalaceSixth = new Song();
        songPalaceSixth.setTitle("Friends Forever");

        Song songPalaceSeventh = new Song();
        songPalaceSeventh.setTitle("Killer Whale");

        Song songPalaceEighth = new Song();
        songPalaceEighth.setTitle("Lover (Don’t Let Me Down)");

        Song songPalaceNinth = new Song();
        songPalaceNinth.setTitle("Sleeper");

        Song songPalaceTenth = new Song();
        songPalaceTenth.setTitle("Salt");

        Song songPalaceEleventh = new Song();
        songPalaceEleventh.setTitle("Shoals");

        Song songPalaceTwelfth = new Song();
        songPalaceTwelfth.setTitle("Where Sky Becomes Sea");

        songService.add(songPalaceFirst);
        songService.add(songPalaceSecond);
        songService.add(songPalaceThird);
        songService.add(songPalaceFourth);
        songService.add(songPalaceFifth);
        songService.add(songPalaceSixth);
        songService.add(songPalaceSeventh);
        songService.add(songPalaceEighth);
        songService.add(songPalaceNinth);
        songService.add(songPalaceTenth);
        songService.add(songPalaceEleventh);
        songService.add(songPalaceTwelfth);

        Record recordPalace = new Record();
        recordPalace.setPerformer("Palace");
        recordPalace.setTitleAlbum("Shoals (Limited Edition)");
        recordPalace.setGenre("Indie");
        recordPalace.setYear("2022");
        recordPalace.setCountry("Europe");
        recordPalace.setLabel("Fiction");
        recordPalace.setSongList(List.of(songPalaceFirst, songPalaceSecond, songPalaceThird,
                songPalaceFourth, songPalaceFifth, songPalaceSixth, songPalaceSeventh,
                songPalaceEighth, songPalaceNinth, songPalaceTenth, songPalaceEleventh,
                songPalaceTwelfth));
        recordPalace.setPrice(1499.0);
        recordPalace.setDiscount(1399.99);
        recordPalace.setPictureUrl("https://i.ibb.co/mv0prjK/5-PALACE-SHOALS.jpg");
        recordPalace.setFormat("1 LP");
        recordPalace.setColor("Blue Vinyl Edition");

        recordService.add(recordPalace);

        // 6. Sophie record

        Song songSophieFirst = new Song();
        songSophieFirst.setTitle("It's Okay To Cry");

        Song songSophieSecond = new Song();
        songSophieSecond.setTitle("Ponyboy");

        Song songSophieThird = new Song();
        songSophieThird.setTitle("Faceshopping");

        Song songSophieFourth = new Song();
        songSophieFourth.setTitle("Is It Cold In The Water?");

        Song songSophieFifth = new Song();
        songSophieFifth.setTitle("Infatuation");

        Song songSophieSixth = new Song();
        songSophieSixth.setTitle("Not Okay");

        Song songSophieSeventh = new Song();
        songSophieSeventh.setTitle("Pretending");

        Song songSophieEighth = new Song();
        songSophieEighth.setTitle("Immaterial");

        Song songSophieNinth = new Song();
        songSophieNinth.setTitle("Whole New World/Pretend World");

        songService.add(songSophieFirst);
        songService.add(songSophieSecond);
        songService.add(songSophieThird);
        songService.add(songSophieFourth);
        songService.add(songSophieFifth);
        songService.add(songSophieSixth);
        songService.add(songSophieSeventh);
        songService.add(songSophieEighth);
        songService.add(songSophieNinth);

        Record recordSophie = new Record();
        recordSophie.setPerformer("Sophie");
        recordSophie.setTitleAlbum("Oil Of Every Pearl's Un-Insides");
        recordSophie.setGenre("Electronic");
        recordSophie.setYear("2018");
        recordSophie.setCountry("Europe");
        recordSophie.setLabel("Future Classic");
        recordSophie.setSongList(List.of(songSophieFirst, songSophieSecond, songSophieThird,
                songSophieFourth, songSophieFifth, songSophieSixth, songSophieSeventh,
                songSophieEighth, songSophieNinth));
        recordSophie.setPrice(1740.0);
        recordSophie.setDiscount(1650.0);
        recordSophie.setPictureUrl("https://i.ibb.co/ZcxkvFB/"
                + "6-Sophie-Oil-Of-Every-Pearl-s-Un-Insides.jpg");
        recordSophie.setFormat("1 LP");
        recordSophie.setColor("Black 180gr Vinyl");

        recordService.add(recordSophie);

        // 7. Metronomy record

        Song songMetronomyFirst = new Song();
        songMetronomyFirst.setTitle("Life and Death");

        Song songMetronomySecond = new Song();
        songMetronomySecond.setTitle("Things Will be Fine");

        Song songMetronomyThird = new Song();
        songMetronomyThird.setTitle("It's Good to be Back");

        Song songMetronomyFourth = new Song();
        songMetronomyFourth.setTitle("Loneliness on the Run");

        Song songMetronomyFifth = new Song();
        songMetronomyFifth.setTitle("Love Factory");

        Song songMetronomySixth = new Song();
        songMetronomySixth.setTitle("I Lost my Mind");

        Song songMetronomySeventh = new Song();
        songMetronomySeventh.setTitle("Right On Time");

        Song songMetronomyEighth = new Song();
        songMetronomyEighth.setTitle("Hold me Tonight feat. PORRIDGE RADIO");

        Song songMetronomyNinth = new Song();
        songMetronomyNinth.setTitle("I Have Seen Enought");

        songService.add(songMetronomyFirst);
        songService.add(songMetronomySecond);
        songService.add(songMetronomyThird);
        songService.add(songMetronomyFourth);
        songService.add(songMetronomyFifth);
        songService.add(songMetronomySixth);
        songService.add(songMetronomySeventh);
        songService.add(songMetronomyEighth);
        songService.add(songMetronomyNinth);

        Record recordMetronomy = new Record();
        recordMetronomy.setPerformer("Metronomy");
        recordMetronomy.setTitleAlbum("Small World (Limited Edition)");
        recordMetronomy.setGenre("Indie");
        recordMetronomy.setYear("2022");
        recordMetronomy.setCountry("France");
        recordMetronomy.setLabel("Virgin");
        recordMetronomy.setSongList(List.of(songMetronomyFirst, songMetronomySecond,
                songMetronomyThird, songMetronomyFourth, songMetronomyFifth,
                songMetronomySixth, songMetronomySeventh, songMetronomyEighth,
                songMetronomyNinth));
        recordMetronomy.setPrice(1110.0);
        recordMetronomy.setDiscount(999.99);
        recordMetronomy.setPictureUrl("https://i.ibb.co/dtsBmC9/7-Metronomy-Small-Worlds.jpg");
        recordMetronomy.setFormat("1 LP");
        recordMetronomy.setColor("Clear Vinyl Edition");

        recordService.add(recordMetronomy);

        // 8. Florence and The Machine record

        Song songFlorenceAndTheMachineFirst = new Song();
        songFlorenceAndTheMachineFirst.setTitle("Only If For A Night");

        Song songFlorenceAndTheMachineSecond = new Song();
        songFlorenceAndTheMachineSecond.setTitle("Shake It Out");

        Song songFlorenceAndTheMachineThird = new Song();
        songFlorenceAndTheMachineThird.setTitle("What The Water Gave Me");

        Song songFlorenceAndTheMachineFourth = new Song();
        songFlorenceAndTheMachineFourth.setTitle("Never Let Me Go");

        Song songFlorenceAndTheMachineFifth = new Song();
        songFlorenceAndTheMachineFifth.setTitle("Breaking Down");

        Song songFlorenceAndTheMachineSixth = new Song();
        songFlorenceAndTheMachineSixth.setTitle("Lover To Lover");

        Song songFlorenceAndTheMachineSeventh = new Song();
        songFlorenceAndTheMachineSeventh.setTitle("No Light, No Light");

        Song songFlorenceAndTheMachineEighth = new Song();
        songFlorenceAndTheMachineEighth.setTitle("Seven Devils");

        Song songFlorenceAndTheMachineNinth = new Song();
        songFlorenceAndTheMachineNinth.setTitle("Heartlines");

        Song songFlorenceAndTheMachineTenth = new Song();
        songFlorenceAndTheMachineTenth.setTitle("Spectrum");

        Song songFlorenceAndTheMachineEleventh = new Song();
        songFlorenceAndTheMachineEleventh.setTitle("All This And Heaven Too");

        Song songFlorenceAndTheMachineTwelfth = new Song();
        songFlorenceAndTheMachineTwelfth.setTitle("Leave My Body");

        songService.add(songFlorenceAndTheMachineFirst);
        songService.add(songFlorenceAndTheMachineSecond);
        songService.add(songFlorenceAndTheMachineThird);
        songService.add(songFlorenceAndTheMachineFourth);
        songService.add(songFlorenceAndTheMachineFifth);
        songService.add(songFlorenceAndTheMachineSixth);
        songService.add(songFlorenceAndTheMachineSeventh);
        songService.add(songFlorenceAndTheMachineEighth);
        songService.add(songFlorenceAndTheMachineNinth);
        songService.add(songFlorenceAndTheMachineTenth);
        songService.add(songFlorenceAndTheMachineEleventh);
        songService.add(songFlorenceAndTheMachineTwelfth);

        Record recordFlorenceAndTheMachine = new Record();
        recordFlorenceAndTheMachine.setPerformer("Florence And The Machine");
        recordFlorenceAndTheMachine.setTitleAlbum("Ceremonials");
        recordFlorenceAndTheMachine.setGenre("Popular");
        recordFlorenceAndTheMachine.setYear("2007");
        recordFlorenceAndTheMachine.setCountry("Brazil");
        recordFlorenceAndTheMachine.setLabel("Island Records");
        recordFlorenceAndTheMachine.setSongList(List.of(songFlorenceAndTheMachineFirst,
                songFlorenceAndTheMachineSecond, songFlorenceAndTheMachineThird,
                songFlorenceAndTheMachineFourth, songFlorenceAndTheMachineFifth,
                songFlorenceAndTheMachineSixth, songFlorenceAndTheMachineSeventh,
                songFlorenceAndTheMachineEighth, songFlorenceAndTheMachineNinth,
                songFlorenceAndTheMachineTenth, songFlorenceAndTheMachineEleventh,
                songFlorenceAndTheMachineTwelfth));
        recordFlorenceAndTheMachine.setPrice(1710.0);
        recordFlorenceAndTheMachine.setDiscount(1600.0);
        recordFlorenceAndTheMachine.setPictureUrl("https://i.ibb.co/1ndmGrW/"
                + "8-Florence-And-The-Machine-Ceremonials.jpg");
        recordFlorenceAndTheMachine.setFormat("2 LP");
        recordFlorenceAndTheMachine.setColor("Black 180gr Vinyl");

        recordService.add(recordFlorenceAndTheMachine);

        // 9. The XX record

        Song songTheXxFirst = new Song();
        songTheXxFirst.setTitle("Angels");

        Song songTheXxSecond = new Song();
        songTheXxSecond.setTitle("Chained");

        Song songTheXxThird = new Song();
        songTheXxThird.setTitle("Fiction");

        Song songTheXxFourth = new Song();
        songTheXxFourth.setTitle("Try");

        Song songTheXxFifth = new Song();
        songTheXxFifth.setTitle("Reunion");

        Song songTheXxSixth = new Song();
        songTheXxSixth.setTitle("Sunset");

        Song songTheXxSeventh = new Song();
        songTheXxSeventh.setTitle("Missing");

        Song songTheXxEighth = new Song();
        songTheXxEighth.setTitle("Tides");

        Song songTheXxNinth = new Song();
        songTheXxNinth.setTitle("Unfold");

        Song songTheXxTenth = new Song();
        songTheXxTenth.setTitle("Swept Away");

        Song songTheXxEleventh = new Song();
        songTheXxEleventh.setTitle("Our Song");

        songService.add(songTheXxFirst);
        songService.add(songTheXxSecond);
        songService.add(songTheXxThird);
        songService.add(songTheXxFourth);
        songService.add(songTheXxFifth);
        songService.add(songTheXxSixth);
        songService.add(songTheXxSeventh);
        songService.add(songTheXxEighth);
        songService.add(songTheXxNinth);
        songService.add(songTheXxTenth);
        songService.add(songTheXxEleventh);

        Record recordTheXX = new Record();
        recordTheXX.setPerformer("The XX");
        recordTheXX.setTitleAlbum("Сoexist");
        recordTheXX.setGenre("Indie");
        recordTheXX.setYear("2012");
        recordTheXX.setCountry("Holland");
        recordTheXX.setLabel("Young Turks");
        recordTheXX.setSongList(List.of(songTheXxFirst, songTheXxSecond, songTheXxThird,
                songTheXxFourth, songTheXxFifth, songTheXxSixth, songTheXxSeventh,
                songTheXxEighth, songTheXxNinth, songTheXxTenth, songTheXxEleventh));
        recordTheXX.setPrice(1559.0);
        recordTheXX.setDiscount(1499.0);
        recordTheXX.setPictureUrl("https://i.ibb.co/3dm0YMD/9-The-XX-Coexist.jpg");
        recordTheXX.setFormat("1 LP");
        recordTheXX.setColor("Black 180gr Vinyl");

        recordService.add(recordTheXX);

        // 10. Ella Fitzgerald record

        Song songEllaFitzgeraldFirst = new Song();
        songEllaFitzgeraldFirst.setTitle("The Song Is Ended");

        Song songEllaFitzgeraldSecond = new Song();
        songEllaFitzgeraldSecond.setTitle("You're Laughing At Me");

        Song songEllaFitzgeraldThird = new Song();
        songEllaFitzgeraldThird.setTitle("How Deep Is The Ocean");

        Song songEllaFitzgeraldFourth = new Song();
        songEllaFitzgeraldFourth.setTitle("Heat Wave");

        Song songEllaFitzgeraldFifth = new Song();
        songEllaFitzgeraldFifth.setTitle("Suppertime");

        Song songEllaFitzgeraldSixth = new Song();
        songEllaFitzgeraldSixth.setTitle("Cheek To Cheek");

        Song songEllaFitzgeraldSeventh = new Song();
        songEllaFitzgeraldSeventh.setTitle("Russian Lullaby");

        Song songEllaFitzgeraldEighth = new Song();
        songEllaFitzgeraldEighth.setTitle("Top Hat, White Tie And Tails");

        Song songEllaFitzgeraldNinth = new Song();
        songEllaFitzgeraldNinth.setTitle("I've Got My Love To Keep Me Warm");

        Song songEllaFitzgeraldTenth = new Song();
        songEllaFitzgeraldTenth.setTitle("Get Thee Behind Me Satan");

        Song songEllaFitzgeraldEleventh = new Song();
        songEllaFitzgeraldEleventh.setTitle("Let's Face The Music And Dance");

        Song songEllaFitzgeraldTwelfth = new Song();
        songEllaFitzgeraldTwelfth.setTitle("Always");

        Song songEllaFitzgeraldThirteenth = new Song();
        songEllaFitzgeraldThirteenth.setTitle("Puttin' On The Ritz");

        Song songEllaFitzgeraldFourteenth = new Song();
        songEllaFitzgeraldFourteenth.setTitle("Let Yourself Go");

        Song songEllaFitzgeraldFifteenth = new Song();
        songEllaFitzgeraldFifteenth.setTitle("Alexander's Ragtime Band");

        songService.add(songEllaFitzgeraldFirst);
        songService.add(songEllaFitzgeraldSecond);
        songService.add(songEllaFitzgeraldThird);
        songService.add(songEllaFitzgeraldFourth);
        songService.add(songEllaFitzgeraldFifth);
        songService.add(songEllaFitzgeraldSixth);
        songService.add(songEllaFitzgeraldSeventh);
        songService.add(songEllaFitzgeraldEighth);
        songService.add(songEllaFitzgeraldNinth);
        songService.add(songEllaFitzgeraldTenth);
        songService.add(songEllaFitzgeraldEleventh);
        songService.add(songEllaFitzgeraldTwelfth);
        songService.add(songEllaFitzgeraldThirteenth);
        songService.add(songEllaFitzgeraldFourteenth);
        songService.add(songEllaFitzgeraldFifteenth);

        Record recordEllaFitzgerald = new Record();
        recordEllaFitzgerald.setPerformer("Ella Fitzgerald");
        recordEllaFitzgerald
                .setTitleAlbum("Ella At The Hollywood Bowl: The Irving Berlin Songbook");
        recordEllaFitzgerald.setGenre("Jazz");
        recordEllaFitzgerald.setYear("2022");
        recordEllaFitzgerald.setCountry("Holland");
        recordEllaFitzgerald.setLabel("Verve");
        recordEllaFitzgerald.setSongList(List.of(songEllaFitzgeraldFirst,
                songEllaFitzgeraldSecond, songEllaFitzgeraldThird, songEllaFitzgeraldFourth,
                songEllaFitzgeraldFifth, songEllaFitzgeraldSixth, songEllaFitzgeraldSeventh,
                songEllaFitzgeraldEighth, songEllaFitzgeraldNinth, songEllaFitzgeraldTenth,
                songEllaFitzgeraldEleventh, songEllaFitzgeraldTwelfth, songEllaFitzgeraldThirteenth,
                songEllaFitzgeraldFourteenth, songEllaFitzgeraldFifteenth));
        recordEllaFitzgerald.setPrice(1110.0);
        recordEllaFitzgerald.setDiscount(1010.10);
        recordEllaFitzgerald.setPictureUrl("https://i.ibb.co/7WL692H/"
                + "10-Ella-At-The-Hollywood-Bowl-The-Irving-Berlin-Songbook.jpg");
        recordEllaFitzgerald.setFormat("1 LP");
        recordEllaFitzgerald.setColor("Black 180gr Vinyl");

        recordService.add(recordEllaFitzgerald);

        // 11. Florence and The Machine DF record

        Song songFlorenceAndTheMachineDfFirst = new Song();
        songFlorenceAndTheMachineDfFirst.setTitle("King");

        Song songFlorenceAndTheMachineDfSecond = new Song();
        songFlorenceAndTheMachineDfSecond.setTitle("Free");

        Song songFlorenceAndTheMachineDfThird = new Song();
        songFlorenceAndTheMachineDfThird.setTitle("Choreomania");

        Song songFlorenceAndTheMachineDfFourth = new Song();
        songFlorenceAndTheMachineDfFourth.setTitle("Back in Town");

        Song songFlorenceAndTheMachineDfFifth = new Song();
        songFlorenceAndTheMachineDfFifth.setTitle("Girls Against God");

        Song songFlorenceAndTheMachineDfSixth = new Song();
        songFlorenceAndTheMachineDfSixth.setTitle("Dream Girl Evil");

        Song songFlorenceAndTheMachineDfSeventh = new Song();
        songFlorenceAndTheMachineDfSeventh.setTitle("Prayer Factory");

        Song songFlorenceAndTheMachineDfEighth = new Song();
        songFlorenceAndTheMachineDfEighth.setTitle("Cassandra");

        Song songFlorenceAndTheMachineDfNinth = new Song();
        songFlorenceAndTheMachineDfNinth.setTitle("Heaven is Here");

        Song songFlorenceAndTheMachineDfTenth = new Song();
        songFlorenceAndTheMachineDfTenth.setTitle("Daffodil");

        Song songFlorenceAndTheMachineDfEleventh = new Song();
        songFlorenceAndTheMachineDfEleventh.setTitle("My Love");

        Song songFlorenceAndTheMachineDfTwelfth = new Song();
        songFlorenceAndTheMachineDfTwelfth.setTitle("Restraint");

        Song songFlorenceAndTheMachineDfThirteenth = new Song();
        songFlorenceAndTheMachineDfThirteenth.setTitle("The Bomb");

        Song songFlorenceAndTheMachineDfFourteenth = new Song();
        songFlorenceAndTheMachineDfFourteenth.setTitle("Morning Elvis");

        songService.add(songFlorenceAndTheMachineDfFirst);
        songService.add(songFlorenceAndTheMachineDfSecond);
        songService.add(songFlorenceAndTheMachineDfThird);
        songService.add(songFlorenceAndTheMachineDfFourth);
        songService.add(songFlorenceAndTheMachineDfFifth);
        songService.add(songFlorenceAndTheMachineDfSixth);
        songService.add(songFlorenceAndTheMachineDfSeventh);
        songService.add(songFlorenceAndTheMachineDfEighth);
        songService.add(songFlorenceAndTheMachineDfNinth);
        songService.add(songFlorenceAndTheMachineDfTenth);
        songService.add(songFlorenceAndTheMachineDfEleventh);
        songService.add(songFlorenceAndTheMachineDfTwelfth);
        songService.add(songFlorenceAndTheMachineDfThirteenth);
        songService.add(songFlorenceAndTheMachineDfFourteenth);

        Record recordFlorenceAndTheMachineDF = new Record();
        recordFlorenceAndTheMachineDF.setPerformer("Florence and The Machine");
        recordFlorenceAndTheMachineDF.setTitleAlbum("Dance Fever");
        recordFlorenceAndTheMachineDF.setGenre("Popular");
        recordFlorenceAndTheMachineDF.setYear("2022");
        recordFlorenceAndTheMachineDF.setCountry("Holland");
        recordFlorenceAndTheMachineDF.setLabel("Universal");
        recordFlorenceAndTheMachineDF.setSongList(List.of(songFlorenceAndTheMachineDfFirst,
                songFlorenceAndTheMachineDfSecond,songFlorenceAndTheMachineDfThird,
                songFlorenceAndTheMachineDfFourth, songFlorenceAndTheMachineDfFifth,
                songFlorenceAndTheMachineDfSixth,songFlorenceAndTheMachineDfSeventh,
                songFlorenceAndTheMachineDfEighth,songFlorenceAndTheMachineDfNinth,
                songFlorenceAndTheMachineDfTenth, songFlorenceAndTheMachineDfEleventh,
                songFlorenceAndTheMachineDfTwelfth,songFlorenceAndTheMachineDfThirteenth,
                songFlorenceAndTheMachineDfFourteenth));
        recordFlorenceAndTheMachineDF.setPrice(1400.0);
        recordFlorenceAndTheMachineDF.setDiscount(0.0);
        recordFlorenceAndTheMachineDF.setPictureUrl("https://i.ibb.co/tMSQwFF/"
                + "11-Florence-And-The-Machine-Dance-Fever.jpg");
        recordFlorenceAndTheMachineDF.setFormat("2 LP");
        recordFlorenceAndTheMachineDF.setColor("Black 180gr Vinyl");

        recordService.add(recordFlorenceAndTheMachineDF);

        // 12. Rufus Du Sol record

        Song songRufusDuSolFirst = new Song();
        songRufusDuSolFirst.setTitle("Next To Me");

        Song songRufusDuSolSecond = new Song();
        songRufusDuSolSecond.setTitle("Make It Happen");

        Song songRufusDuSolThird = new Song();
        songRufusDuSolThird.setTitle("See You Again");

        Song songRufusDuSolFourth = new Song();
        songRufusDuSolFourth.setTitle("I Don’t Wanna Leave");

        Song songRufusDuSolFifth = new Song();
        songRufusDuSolFifth.setTitle("Alive");

        Song songRufusDuSolSixth = new Song();
        songRufusDuSolSixth.setTitle("Alive (Reprise)");

        Song songRufusDuSolSeventh = new Song();
        songRufusDuSolSeventh.setTitle("On My Knees");

        Song songRufusDuSolEighth = new Song();
        songRufusDuSolEighth.setTitle("Wildfire");

        Song songRufusDuSolNinth = new Song();
        songRufusDuSolNinth.setTitle("Surrender (feat. Curtis Harding)");

        Song songRufusDuSolTenth = new Song();
        songRufusDuSolTenth.setTitle("Devotion");

        Song songRufusDuSolEleventh = new Song();
        songRufusDuSolEleventh.setTitle("Always");

        songService.add(songRufusDuSolFirst);
        songService.add(songRufusDuSolSecond);
        songService.add(songRufusDuSolThird);
        songService.add(songRufusDuSolFourth);
        songService.add(songRufusDuSolFifth);
        songService.add(songRufusDuSolSixth);
        songService.add(songRufusDuSolSeventh);
        songService.add(songRufusDuSolEighth);
        songService.add(songRufusDuSolNinth);
        songService.add(songRufusDuSolTenth);
        songService.add(songRufusDuSolEleventh);

        Record recordRufusDuSol = new Record();
        recordRufusDuSol.setPerformer("Rufus Du Sol");
        recordRufusDuSol.setTitleAlbum("Surrender");
        recordRufusDuSol.setGenre("Electronic");
        recordRufusDuSol.setYear("2022");
        recordRufusDuSol.setCountry("Europe");
        recordRufusDuSol.setLabel("Warner");
        recordRufusDuSol.setSongList(List.of(songRufusDuSolFirst,songRufusDuSolSecond,
                songRufusDuSolThird,songRufusDuSolFourth,songRufusDuSolFifth,
                songRufusDuSolSixth,songRufusDuSolSeventh,songRufusDuSolEighth,
                songRufusDuSolNinth,songRufusDuSolTenth,songRufusDuSolEleventh));
        recordRufusDuSol.setPrice(1800.0);
        recordRufusDuSol.setDiscount(0.0);
        recordRufusDuSol.setPictureUrl("https://i.ibb.co/bdWDd2h/12-Rufus-De-Sol-Surrender.jpg");
        recordRufusDuSol.setFormat("2 LP");
        recordRufusDuSol.setColor("Red Coloured Edition");

        recordService.add(recordRufusDuSol);

        // 13. Foals record

        Song songFoalsFirst = new Song();
        songFoalsFirst.setTitle("The French Open");

        Song songFoalsSecond = new Song();
        songFoalsSecond.setTitle("Cassius");

        Song songFoalsThird = new Song();
        songFoalsThird.setTitle("Red Socks Pugie");

        Song songFoalsFourth = new Song();
        songFoalsFourth.setTitle("Olympic Airways");

        Song songFoalsFifth = new Song();
        songFoalsFifth.setTitle("Electric Bloom");

        Song songFoalsSixth = new Song();
        songFoalsSixth.setTitle("Balloons");

        Song songFoalsSeventh = new Song();
        songFoalsSeventh.setTitle("Heavy Water");

        Song songFoalsEighth = new Song();
        songFoalsEighth.setTitle("Two Steps Twice");

        Song songFoalsNinth = new Song();
        songFoalsNinth.setTitle("Big Big Love (Fig. 2)");

        Song songFoalsTenth = new Song();
        songFoalsTenth.setTitle("Like Swimming");

        Song songFoalsEleventh = new Song();
        songFoalsEleventh.setTitle("Tron");

        songService.add(songFoalsFirst);
        songService.add(songFoalsSecond);
        songService.add(songFoalsThird);
        songService.add(songFoalsFourth);
        songService.add(songFoalsFifth);
        songService.add(songFoalsSixth);
        songService.add(songFoalsSeventh);
        songService.add(songFoalsEighth);
        songService.add(songFoalsNinth);
        songService.add(songFoalsTenth);
        songService.add(songFoalsEleventh);

        Record recordFoals = new Record();
        recordFoals.setPerformer("Foals");
        recordFoals.setTitleAlbum("Antidotes (Limited Edition)");
        recordFoals.setGenre("Indie");
        recordFoals.setYear("2022");
        recordFoals.setCountry("Holland");
        recordFoals.setLabel("Warner Music Uk Ltd");
        recordFoals.setSongList(List.of(songFoalsFirst,songFoalsSecond,songFoalsThird,
                songFoalsFourth,songFoalsFifth,songFoalsSixth,songFoalsSeventh,
                songFoalsEighth,songFoalsNinth,songFoalsTenth,songFoalsEleventh));
        recordFoals.setPrice(990.0);
        recordFoals.setDiscount(0.0);
        recordFoals.setPictureUrl("https://i.ibb.co/T1nz4cv/13-Foals-Antidots.jpg");
        recordFoals.setFormat("1 LP");
        recordFoals.setColor("Blue Colored Edition");

        recordService.add(recordFoals);

        // 14. Yaya Bey record

        Song songYayaBeyFirst = new Song();
        songYayaBeyFirst.setTitle("Intro");

        Song songYayaBeySecond = new Song();
        songYayaBeySecond.setTitle("Libation");

        Song songYayaBeyThird = new Song();
        songYayaBeyThird.setTitle("Big Daddy Ya");

        Song songYayaBeyFourth = new Song();
        songYayaBeyFourth.setTitle("Keisha");

        Song songYayaBeyFifth = new Song();
        songYayaBeyFifth.setTitle("Nobody Knows");

        Song songYayaBeySixth = new Song();
        songYayaBeySixth.setTitle("Alright");

        Song songYayaBeySeventh = new Song();
        songYayaBeySeventh.setTitle("Meet Me In Brooklyn");

        Song songYayaBeyEighth = new Song();
        songYayaBeyEighth.setTitle("It Was Just A Dance");

        Song songYayaBeyNinth = new Song();
        songYayaBeyNinth.setTitle("Pour Up (Feat. Dj Nativesun)");

        Song songYayaBeyTenth = new Song();
        songYayaBeyTenth.setTitle("Uh Uh Nxgga");

        Song songYayaBeyEleventh = new Song();
        songYayaBeyEleventh.setTitle("Reprise");

        Song songYayaBeyTwelfth = new Song();
        songYayaBeyTwelfth.setTitle("Rolling Stoner");

        Song songYayaBeyThirteenth = new Song();
        songYayaBeyThirteenth.setTitle("Don't Fucking Call Me");

        Song songYayaBeyFourteenth = new Song();
        songYayaBeyFourteenth.setTitle("I'm Certain She's There");

        Song songYayaBeyFifteenth = new Song();
        songYayaBeyFifteenth.setTitle("Street Fighter Blues");

        Song songYayaBeySixteenth = new Song();
        songYayaBeySixteenth.setTitle("Mama Loves Her Son");

        Song songYayaBeySeventeenth = new Song();
        songYayaBeySeventeenth.setTitle("Either Way");

        Song songYayaBeyEighteenth = new Song();
        songYayaBeyEighteenth.setTitle("Blessings");

        songService.add(songYayaBeyFirst);
        songService.add(songYayaBeySecond);
        songService.add(songYayaBeyThird);
        songService.add(songYayaBeyFourth);
        songService.add(songYayaBeyFifth);
        songService.add(songYayaBeySixth);
        songService.add(songYayaBeySeventh);
        songService.add(songYayaBeyEighth);
        songService.add(songYayaBeyNinth);
        songService.add(songYayaBeyTenth);
        songService.add(songYayaBeyEleventh);
        songService.add(songYayaBeyTwelfth);
        songService.add(songYayaBeyThirteenth);
        songService.add(songYayaBeyFourteenth);
        songService.add(songYayaBeyFifteenth);
        songService.add(songYayaBeySixteenth);
        songService.add(songYayaBeySeventeenth);
        songService.add(songYayaBeyEighteenth);

        Record recordYayaBey = new Record();
        recordYayaBey.setPerformer("Yaya Bey");
        recordYayaBey.setTitleAlbum("Remember Your North Star");
        recordYayaBey.setGenre("Soul");
        recordYayaBey.setYear("2022");
        recordYayaBey.setCountry("Holland");
        recordYayaBey.setLabel("Big Dada");
        recordYayaBey.setSongList(List.of(songYayaBeyFirst, songYayaBeySecond, songYayaBeyThird,
                songYayaBeyFourth, songYayaBeyFifth, songYayaBeySixth, songYayaBeySeventh,
                songYayaBeyEighth, songYayaBeyNinth, songYayaBeyTenth, songYayaBeyEleventh,
                songYayaBeyTwelfth, songYayaBeyThirteenth, songYayaBeyFourteenth,
                songYayaBeyFifteenth, songYayaBeySixteenth, songYayaBeySeventeenth,
                songYayaBeyEighteenth));
        recordYayaBey.setPrice(1005.0);
        recordYayaBey.setDiscount(0.0);
        recordYayaBey.setPictureUrl("https://i.ibb.co/pbhz7s8/"
                + "14-Yaya-Bey-Remember-Your-North-Star.jpg");
        recordYayaBey.setFormat("1 LP");
        recordYayaBey.setColor("Crystal Blue Edition");

        recordService.add(recordYayaBey);

        // 15. Earth, Wind & Fire record

        Song songEarthWindAndFireFirst = new Song();
        songEarthWindAndFireFirst.setTitle("Getaway");

        Song songEarthWindAndFireSecond = new Song();
        songEarthWindAndFireSecond.setTitle("On Your Face");

        Song songEarthWindAndFireThird = new Song();
        songEarthWindAndFireThird.setTitle("Imagination");

        Song songEarthWindAndFireFourth = new Song();
        songEarthWindAndFireFourth.setTitle("Spirit");

        Song songEarthWindAndFireFifth = new Song();
        songEarthWindAndFireFifth.setTitle("Saturday Nite");

        Song songEarthWindAndFireSixth = new Song();
        songEarthWindAndFireSixth.setTitle("Earth, Wind & Fire");

        Song songEarthWindAndFireSeventh = new Song();
        songEarthWindAndFireSeventh.setTitle("Departure");

        Song songEarthWindAndFireEighth = new Song();
        songEarthWindAndFireEighth.setTitle("Biyo");

        Song songEarthWindAndFireNinth = new Song();
        songEarthWindAndFireNinth.setTitle("Burnin' Bush");

        songService.add(songEarthWindAndFireFirst);
        songService.add(songEarthWindAndFireSecond);
        songService.add(songEarthWindAndFireThird);
        songService.add(songEarthWindAndFireFourth);
        songService.add(songEarthWindAndFireFifth);
        songService.add(songEarthWindAndFireSixth);
        songService.add(songEarthWindAndFireSeventh);
        songService.add(songEarthWindAndFireEighth);
        songService.add(songEarthWindAndFireNinth);

        Record recordEarthWindAndFire = new Record();
        recordEarthWindAndFire.setPerformer("Earth, Wind And Fire");
        recordEarthWindAndFire.setTitleAlbum("Spirit");
        recordEarthWindAndFire.setGenre("Funk");
        recordEarthWindAndFire.setYear("2022");
        recordEarthWindAndFire.setCountry("Holland");
        recordEarthWindAndFire.setLabel("Music On Vinyl");
        recordEarthWindAndFire.setSongList(List.of(songEarthWindAndFireFirst,
                songEarthWindAndFireSecond, songEarthWindAndFireThird, songEarthWindAndFireFourth,
                songEarthWindAndFireFifth, songEarthWindAndFireSixth, songEarthWindAndFireSeventh,
                songEarthWindAndFireEighth, songEarthWindAndFireNinth));
        recordEarthWindAndFire.setPrice(894.0);
        recordEarthWindAndFire.setDiscount(0.0);
        recordEarthWindAndFire.setPictureUrl("https://i.ibb.co/yyj1m7P/"
                + "15-Spirit-Earth-Wind-And-Fire.jpg");
        recordEarthWindAndFire.setFormat("1 LP");
        recordEarthWindAndFire.setColor("Black 180gr Vinyl");

        recordService.add(recordEarthWindAndFire);

        // 16. The Smile record

        Song songTheSmileFirst = new Song();
        songTheSmileFirst.setTitle("The Same");

        Song songTheSmileSecond = new Song();
        songTheSmileSecond.setTitle("The Opposite");

        Song songTheSmileThird = new Song();
        songTheSmileThird.setTitle("You Will Never Work in Television Again");

        Song songTheSmileFourth = new Song();
        songTheSmileFourth.setTitle("Pana-vision");

        Song songTheSmileFifth = new Song();
        songTheSmileFifth.setTitle("The Smoke");

        Song songTheSmileSixth = new Song();
        songTheSmileSixth.setTitle("Speech Bubbles");

        Song songTheSmileSeventh = new Song();
        songTheSmileSeventh.setTitle("Thin Thing");

        Song songTheSmileEighth = new Song();
        songTheSmileEighth.setTitle("Open the Floodgates");

        Song songTheSmileNinth = new Song();
        songTheSmileNinth.setTitle("Free in the Knowledge");

        Song songTheSmileTenth = new Song();
        songTheSmileTenth.setTitle("A Hairdryer");

        Song songTheSmileEleventh = new Song();
        songTheSmileEleventh.setTitle("Waving a White Flag");

        Song songTheSmileTwelfth = new Song();
        songTheSmileTwelfth.setTitle("We Don’t Know What Tomorrow Brings");

        songService.add(songTheSmileFirst);
        songService.add(songTheSmileSecond);
        songService.add(songTheSmileThird);
        songService.add(songTheSmileFourth);
        songService.add(songTheSmileFifth);
        songService.add(songTheSmileSixth);
        songService.add(songTheSmileSeventh);
        songService.add(songTheSmileEighth);
        songService.add(songTheSmileNinth);
        songService.add(songTheSmileTenth);
        songService.add(songTheSmileEleventh);
        songService.add(songTheSmileTwelfth);

        Record recordTheSmile = new Record();
        recordTheSmile.setPerformer("The Smile");
        recordTheSmile.setTitleAlbum("A Light For Attracting Attention (Limited Edition)");
        recordTheSmile.setGenre("Rock");
        recordTheSmile.setYear("2022");
        recordTheSmile.setCountry("Europe");
        recordTheSmile.setLabel("Xl Recordings");
        recordTheSmile.setSongList(List.of(songTheSmileFirst, songTheSmileSecond, songTheSmileThird,
                songTheSmileFourth, songTheSmileFifth, songTheSmileSixth, songTheSmileSeventh,
                songTheSmileEighth, songTheSmileNinth, songTheSmileTenth, songTheSmileEleventh,
                songTheSmileTwelfth));
        recordTheSmile.setPrice(1650.0);
        recordTheSmile.setDiscount(0.0);
        recordTheSmile.setPictureUrl("https://i.ibb.co/j8MQF8G/"
                + "16-The-Smile-A-Light-For-Attracting-Attention.jpg");
        recordTheSmile.setFormat("2 LP");
        recordTheSmile.setColor("Yellow Vinyl Edition");

        recordService.add(recordTheSmile);

        // 17. Various Artists record

        Song songVariousArtistFirst = new Song();
        songVariousArtistFirst.setTitle("The Gospel Truth I/Main Titles");

        Song songVariousArtistSecond = new Song();
        songVariousArtistSecond.setTitle("The Gospel Truth II");

        Song songVariousArtistThird = new Song();
        songVariousArtistThird.setTitle("The Gospel Truth III");

        Song songVariousArtistFourth = new Song();
        songVariousArtistFourth.setTitle("Go The Distance");

        Song songVariousArtistFifth = new Song();
        songVariousArtistFifth.setTitle("Go The Distance (Reprise)");

        Song songVariousArtistSixth = new Song();
        songVariousArtistSixth.setTitle("One Last Hope");

        Song songVariousArtistSeventh = new Song();
        songVariousArtistSeventh.setTitle("Zero To Hero");

        Song songVariousArtistEighth = new Song();
        songVariousArtistEighth.setTitle("I Won't Say (I'm in Love)");

        Song songVariousArtistNinth = new Song();
        songVariousArtistNinth.setTitle("A Star Is Born");

        Song songVariousArtistTenth = new Song();
        songVariousArtistTenth.setTitle("Go The Distance (Single)");

        songService.add(songVariousArtistFirst);
        songService.add(songVariousArtistSecond);
        songService.add(songVariousArtistThird);
        songService.add(songVariousArtistFourth);
        songService.add(songVariousArtistFifth);
        songService.add(songVariousArtistSixth);
        songService.add(songVariousArtistSeventh);
        songService.add(songVariousArtistEighth);
        songService.add(songVariousArtistNinth);
        songService.add(songVariousArtistTenth);

        Record recordVariousArtist = new Record();
        recordVariousArtist.setPerformer("Various Artists");
        recordVariousArtist.setTitleAlbum("Songs From Hercules (Limited Edition)");
        recordVariousArtist.setGenre("Original Soundtrack");
        recordVariousArtist.setYear("2022");
        recordVariousArtist.setCountry("Holland");
        recordVariousArtist.setLabel("Disney");
        recordVariousArtist.setSongList(List.of(songVariousArtistFirst, songVariousArtistSecond,
                songVariousArtistThird, songVariousArtistFourth, songVariousArtistFifth,
                songVariousArtistSixth, songVariousArtistSeventh, songVariousArtistEighth,
                songVariousArtistNinth, songVariousArtistTenth));
        recordVariousArtist.setPrice(1740.0);
        recordVariousArtist.setDiscount(0.0);
        recordVariousArtist.setPictureUrl("https://i.ibb.co/Lp4qsqD/"
                + "17-Original-Soundtrack-Hercules.jpg");
        recordVariousArtist.setFormat("1 LP");
        recordVariousArtist.setColor("Orange Vinyl Edition");

        recordService.add(recordVariousArtist);

        // 18. DVR record

        Song songDvrFirst = new Song();
        songDvrFirst.setTitle("Dirty Tapes");

        Song songDvrSecond = new Song();
        songDvrSecond.setTitle("Stupid");

        Song songDvrThird = new Song();
        songDvrThird.setTitle("Lowlife (with Kenny Beats)");

        Song songDvrFourth = new Song();
        songDvrFourth.setTitle("Drugs");

        Song songDvrFifth = new Song();
        songDvrFifth.setTitle("Tunnel Vision");

        songService.add(songDvrFirst);
        songService.add(songDvrSecond);
        songService.add(songDvrThird);
        songService.add(songDvrFourth);
        songService.add(songDvrFifth);

        Record recordDvr = new Record();
        recordDvr.setPerformer("DVR");
        recordDvr.setTitleAlbum("Dirty Tapes EP");
        recordDvr.setGenre("Electronic");
        recordDvr.setYear("2022");
        recordDvr.setCountry("Europe");
        recordDvr.setLabel("Xl Recordings");
        recordDvr.setSongList(List.of(songDvrFirst, songDvrSecond, songDvrThird, songDvrFourth,
                songDvrFifth));
        recordDvr.setPrice(779.0);
        recordDvr.setDiscount(0.0);
        recordDvr.setPictureUrl("https://i.ibb.co/JFB0fGg/18-DVR-Dirty-Tapes-EP.jpg");
        recordDvr.setFormat("1 LP");
        recordDvr.setColor("Black 180gr Vinyl");

        recordService.add(recordDvr);

        // 19. David Bowie record

        Song songDavidBowieFirst = new Song();
        songDavidBowieFirst.setTitle("It's No Game (Part 1)");

        Song songDavidBowieSecond = new Song();
        songDavidBowieSecond.setTitle("Up The Hill Backwards");

        Song songDavidBowieThird = new Song();
        songDavidBowieThird.setTitle("Scary Monsters (And Super Creeps)");

        Song songDavidBowieFourth = new Song();
        songDavidBowieFourth.setTitle("Ashes To Ashes");

        Song songDavidBowieFifth = new Song();
        songDavidBowieFifth.setTitle("Fashion");

        Song songDavidBowieSixth = new Song();
        songDavidBowieSixth.setTitle("Teenage Wildlife");

        Song songDavidBowieSeventh = new Song();
        songDavidBowieSeventh.setTitle("Scream Like A Baby");

        Song songDavidBowieEighth = new Song();
        songDavidBowieEighth.setTitle("Kingdom Come (Written-By – Tom Verlaine) ");

        Song songDavidBowieNinth = new Song();
        songDavidBowieNinth.setTitle("Because You're Young");

        Song songDavidBowieTenth = new Song();
        songDavidBowieTenth.setTitle("It's No Game (Part 2)");

        songService.add(songDavidBowieFirst);
        songService.add(songDavidBowieSecond);
        songService.add(songDavidBowieThird);
        songService.add(songDavidBowieFourth);
        songService.add(songDavidBowieFifth);
        songService.add(songDavidBowieSixth);
        songService.add(songDavidBowieSeventh);
        songService.add(songDavidBowieEighth);
        songService.add(songDavidBowieNinth);
        songService.add(songDavidBowieTenth);

        Record recordDavidBowie = new Record();
        recordDavidBowie.setPerformer("David Bowie");
        recordDavidBowie.setTitleAlbum("Scary Monsters");
        recordDavidBowie.setGenre("Popular");
        recordDavidBowie.setYear("2018");
        recordDavidBowie.setCountry("Holland");
        recordDavidBowie.setLabel("Plg");
        recordDavidBowie.setSongList(List.of(songDavidBowieFirst, songDavidBowieSecond,
                songDavidBowieThird, songDavidBowieFourth, songDavidBowieFifth,
                songDavidBowieSixth, songDavidBowieSeventh, songDavidBowieEighth,
                songDavidBowieNinth, songDavidBowieTenth));
        recordDavidBowie.setPrice(1320.0);
        recordDavidBowie.setDiscount(0.0);
        recordDavidBowie.setPictureUrl("https://i.ibb.co/VV2Mb1F/"
                + "19-David-Bowie-Scary-Monsters.jpg");
        recordDavidBowie.setFormat("1 LP");
        recordDavidBowie.setColor("Black 180gr Vinyl");

        recordService.add(recordDavidBowie);

        // 20. Bloodhound Gang record

        Song songBloodhoundGangFirst = new Song();
        songBloodhoundGangFirst.setTitle("Altogether Ooky");

        Song songBloodhoundGangSecond = new Song();
        songBloodhoundGangSecond.setTitle("Fire Water Burn");

        Song songBloodhoundGangThird = new Song();
        songBloodhoundGangThird.setTitle("Along Comes Mary");

        Song songBloodhoundGangFourth = new Song();
        songBloodhoundGangFourth.setTitle("Foxtrot Uniform Charlie Kilo");

        Song songBloodhoundGangFifth = new Song();
        songBloodhoundGangFifth.setTitle("The Bad Touch");

        Song songBloodhoundGangSixth = new Song();
        songBloodhoundGangSixth.setTitle("No Hard Feelings");

        Song songBloodhoundGangSeventh = new Song();
        songBloodhoundGangSeventh
                .setTitle("A Lap Dance Is So Much Better When The Stripper Is Crying");

        Song songBloodhoundGangEighth = new Song();
        songBloodhoundGangEighth.setTitle("Kiss Me Where It Smells Funny");

        Song songBloodhoundGangNinth = new Song();
        songBloodhoundGangNinth.setTitle("The Ballad Of Chasey Lain");

        Song songBloodhoundGangTenth = new Song();
        songBloodhoundGangTenth.setTitle("Screwing You On The Beach At Night");

        Song songBloodhoundGangEleventh = new Song();
        songBloodhoundGangEleventh.setTitle("Three Point One Four");

        Song songBloodhoundGangTwelfth = new Song();
        songBloodhoundGangTwelfth.setTitle("You're Pretty When I'm Drunk");

        Song songBloodhoundGangThirteenth = new Song();
        songBloodhoundGangThirteenth.setTitle("Uhn Tiss Uhn Tiss Uhn Tiss");

        Song songBloodhoundGangFourteenth = new Song();
        songBloodhoundGangFourteenth.setTitle("I Hope You Die");

        Song songBloodhoundGangFifteenth = new Song();
        songBloodhoundGangFifteenth.setTitle("My Dad Says That's For Pussies");

        Song songBloodhoundGangSixteenth = new Song();
        songBloodhoundGangSixteenth.setTitle("Die Atzen - Disco Pogo");

        songService.add(songBloodhoundGangFirst);
        songService.add(songBloodhoundGangSecond);
        songService.add(songBloodhoundGangThird);
        songService.add(songBloodhoundGangFourth);
        songService.add(songBloodhoundGangFifth);
        songService.add(songBloodhoundGangSixth);
        songService.add(songBloodhoundGangSeventh);
        songService.add(songBloodhoundGangEighth);
        songService.add(songBloodhoundGangNinth);
        songService.add(songBloodhoundGangTenth);
        songService.add(songBloodhoundGangEleventh);
        songService.add(songBloodhoundGangTwelfth);
        songService.add(songBloodhoundGangThirteenth);
        songService.add(songBloodhoundGangFourteenth);
        songService.add(songBloodhoundGangFifteenth);
        songService.add(songBloodhoundGangSixteenth);

        Record recordBloodhoundGang = new Record();
        recordBloodhoundGang.setPerformer("Bloodhound Gang");
        recordBloodhoundGang.setTitleAlbum("Show Us Your Hits");
        recordBloodhoundGang.setGenre("Rock");
        recordBloodhoundGang.setYear("2022");
        recordBloodhoundGang.setCountry("Holland");
        recordBloodhoundGang.setLabel("Universal");
        recordBloodhoundGang.setSongList(List.of(songBloodhoundGangFirst,
                songBloodhoundGangSecond, songBloodhoundGangThird, songBloodhoundGangFourth,
                songBloodhoundGangFifth, songBloodhoundGangSixth, songBloodhoundGangSeventh,
                songBloodhoundGangEighth, songBloodhoundGangNinth, songBloodhoundGangTenth,
                songBloodhoundGangEleventh, songBloodhoundGangTwelfth, songBloodhoundGangThirteenth,
                songBloodhoundGangFourteenth, songBloodhoundGangFifteenth,
                songBloodhoundGangSixteenth));
        recordBloodhoundGang.setPrice(1920.0);
        recordBloodhoundGang.setDiscount(0.0);
        recordBloodhoundGang.setPictureUrl("https://i.ibb.co/ysNsNDL/"
                + "20-Bloodhound-Gang-Show-Us-Your-Hits.jpg");
        recordBloodhoundGang.setFormat("2 LP");
        recordBloodhoundGang.setColor("Blue Vinyl Edition");

        recordService.add(recordBloodhoundGang);

        // 21. Alfa Mist record

        Song songAlfaMistFirst = new Song();
        songAlfaMistFirst.setTitle("Keep On");

        Song songAlfaMistSecond = new Song();
        songAlfaMistSecond.setTitle("Potential");

        Song songAlfaMistThird = new Song();
        songAlfaMistThird.setTitle("Errors");

        Song songAlfaMistFourth = new Song();
        songAlfaMistFourth.setTitle("Breathe");

        Song songAlfaMistFifth = new Song();
        songAlfaMistFifth.setTitle("7th October");

        Song songAlfaMistSixth = new Song();
        songAlfaMistSixth.setTitle("Kyoki");

        Song songAlfaMistSeventh = new Song();
        songAlfaMistSeventh.setTitle("Nucleus");

        Song songAlfaMistEighth = new Song();
        songAlfaMistEighth.setTitle("Brian");

        songService.add(songAlfaMistFirst);
        songService.add(songAlfaMistSecond);
        songService.add(songAlfaMistThird);
        songService.add(songAlfaMistFourth);
        songService.add(songAlfaMistFifth);
        songService.add(songAlfaMistSixth);
        songService.add(songAlfaMistSeventh);
        songService.add(songAlfaMistEighth);

        Record recordAlfaMist = new Record();
        recordAlfaMist.setPerformer("Alfa Mist");
        recordAlfaMist.setTitleAlbum("Antiphon");
        recordAlfaMist.setGenre("Jazz");
        recordAlfaMist.setYear("2022");
        recordAlfaMist.setCountry("Japan");
        recordAlfaMist.setLabel("Sekito");
        recordAlfaMist.setSongList(List.of(songAlfaMistFirst, songAlfaMistSecond,
                songAlfaMistThird, songAlfaMistFourth, songAlfaMistFifth,
                songAlfaMistSixth, songAlfaMistSeventh, songAlfaMistEighth));
        recordAlfaMist.setPrice(1416.0);
        recordAlfaMist.setDiscount(0.0);
        recordAlfaMist.setPictureUrl("https://i.ibb.co/D9mqM2Q/21-Alfa-Mist-Antiphon.jpg");
        recordAlfaMist.setFormat("2 LP");
        recordAlfaMist.setColor("Black 180gr Vinyl");

        recordService.add(recordAlfaMist);

        // 22. Hot Chip record

        Song songHotChipFirst = new Song();
        songHotChipFirst.setTitle("Down");

        Song songHotChipSecond = new Song();
        songHotChipSecond.setTitle("Eleanor");

        Song songHotChipThird = new Song();
        songHotChipThird.setTitle("Freakout/Release");

        Song songHotChipFourth = new Song();
        songHotChipFourth.setTitle("Broken");

        Song songHotChipFifth = new Song();
        songHotChipFifth.setTitle("Not Alone");

        Song songHotChipSixth = new Song();
        songHotChipSixth.setTitle("Hard To Be Funky feat. Lou Hayter");

        Song songHotChipSeventh = new Song();
        songHotChipSeventh.setTitle("Time");

        Song songHotChipEighth = new Song();
        songHotChipEighth.setTitle("Miss The Bliss");

        Song songHotChipNinth = new Song();
        songHotChipNinth.setTitle("The Evil That Men Do feat. Cadence Weapon");

        Song songHotChipTenth = new Song();
        songHotChipTenth.setTitle("Guilty");

        Song songHotChipEleventh = new Song();
        songHotChipEleventh.setTitle("Out Of My Depth");

        Song songHotChipTwelfth = new Song();
        songHotChipTwelfth.setTitle("The Most Painful Game (Bonus Track)");

        songService.add(songHotChipFirst);
        songService.add(songHotChipSecond);
        songService.add(songHotChipThird);
        songService.add(songHotChipFourth);
        songService.add(songHotChipFifth);
        songService.add(songHotChipSixth);
        songService.add(songHotChipSeventh);
        songService.add(songHotChipEighth);
        songService.add(songHotChipNinth);
        songService.add(songHotChipTenth);
        songService.add(songHotChipEleventh);
        songService.add(songHotChipTwelfth);

        Record recordHotChip = new Record();
        recordHotChip.setPerformer("Hot Chip");
        recordHotChip.setTitleAlbum("Freakout / Release (Limited Edition)");
        recordHotChip.setGenre("Electronic");
        recordHotChip.setYear("2022");
        recordHotChip.setCountry("Holland");
        recordHotChip.setLabel("Domino");
        recordHotChip.setSongList(List.of(songHotChipFirst, songHotChipSecond, songHotChipThird,
                songHotChipFourth, songHotChipFifth, songHotChipSixth, songHotChipSeventh,
                songHotChipEighth, songHotChipNinth, songHotChipTenth, songHotChipEleventh,
                songHotChipTwelfth));
        recordHotChip.setPrice(1410.0);
        recordHotChip.setDiscount(0.0);
        recordHotChip.setPictureUrl("https://i.ibb.co/GpVG7HR/22-Hot-Chip-Freakout.jpg");
        recordHotChip.setFormat("2 LP");
        recordHotChip.setColor("Orange Vinyl Edition");

        recordService.add(recordHotChip);

        // 23. KOKOROKO record

        Song songKokorokofirst = new Song();
        songKokorokofirst.setTitle("Tojo");

        Song songKokorokoSecond = new Song();
        songKokorokoSecond.setTitle("Blue Robe (Pt. I)");

        Song songKokorokoThird = new Song();
        songKokorokoThird.setTitle("Ewà Inú");

        Song songKokorokoFourth = new Song();
        songKokorokoFourth.setTitle("Age Of Ascent");

        Song songKokorokoFifth = new Song();
        songKokorokoFifth.setTitle("Dide O");

        Song songKokorokoSixth = new Song();
        songKokorokoSixth.setTitle("Soul Searching");

        Song songKokorokoSeventh = new Song();
        songKokorokoSeventh.setTitle("We Give Thanks");

        Song songKokorokoEighth = new Song();
        songKokorokoEighth.setTitle("Those Good Times");

        Song songKokorokoNinth = new Song();
        songKokorokoNinth.setTitle("Reprise");

        Song songKokorokoTenth = new Song();
        songKokorokoTenth.setTitle("War Dance");

        Song songKokorokoEleventh = new Song();
        songKokorokoEleventh.setTitle("Interlude");

        Song songKokorokoTwelfth = new Song();
        songKokorokoTwelfth.setTitle("Home");

        Song songKokorokoThirteenth = new Song();
        songKokorokoThirteenth.setTitle("Something's Going On");

        Song songKokorokoFourteenth = new Song();
        songKokorokoFourteenth.setTitle("Outro");

        Song songKokorokoFifteenth = new Song();
        songKokorokoFifteenth.setTitle("Blue Robe (Pt. Ii)");

        songService.add(songKokorokofirst);
        songService.add(songKokorokoSecond);
        songService.add(songKokorokoThird);
        songService.add(songKokorokoFourth);
        songService.add(songKokorokoFifth);
        songService.add(songKokorokoSixth);
        songService.add(songKokorokoSeventh);
        songService.add(songKokorokoEighth);
        songService.add(songKokorokoNinth);
        songService.add(songKokorokoTenth);
        songService.add(songKokorokoEleventh);
        songService.add(songKokorokoTwelfth);
        songService.add(songKokorokoThirteenth);
        songService.add(songKokorokoFourteenth);
        songService.add(songKokorokoFifteenth);

        Record recordKokoroko = new Record();
        recordKokoroko.setPerformer("KOKOROKO");
        recordKokoroko.setTitleAlbum("Could We Be More (Limited Edition)");
        recordKokoroko.setGenre("Jazz");
        recordKokoroko.setYear("2022");
        recordKokoroko.setCountry("UK");
        recordKokoroko.setLabel("Brownswood");
        recordKokoroko.setSongList(List.of(songKokorokofirst, songKokorokoSecond,
                songKokorokoThird, songKokorokoFourth, songKokorokoFifth, songKokorokoSixth,
                songKokorokoSeventh, songKokorokoEighth, songKokorokoNinth, songKokorokoTenth,
                songKokorokoEleventh, songKokorokoTwelfth, songKokorokoThirteenth,
                songKokorokoFourteenth, songKokorokoFifteenth));
        recordKokoroko.setPrice(1464.0);
        recordKokoroko.setDiscount(0.0);
        recordKokoroko.setPictureUrl("https://i.ibb.co/dpH6Nvq/23-KOKOROKO-Could-We-Be-More.jpg");
        recordKokoroko.setFormat("1 LP");
        recordKokoroko.setColor("Blue Vinyl Edition");

        recordService.add(recordKokoroko);

        // 24. Original Soundtrack - Drive record

        Song songOriginalSoundtrackDFirst = new Song();
        songOriginalSoundtrackDFirst.setTitle("Kavinsky & Lovefoxxx – Nightcall");

        Song songOriginalSoundtrackDSecond = new Song();
        songOriginalSoundtrackDSecond.setTitle("Desire – Under Your Spell ");

        Song songOriginalSoundtrackDThird = new Song();
        songOriginalSoundtrackDThird.setTitle("College Feat. Electric Youth – A Real Hero ");

        Song songOriginalSoundtrackDFourth = new Song();
        songOriginalSoundtrackDFourth.setTitle("Riz Ortolani Feat. Katyna Ranieri – Oh My Love ");

        Song songOriginalSoundtrackDFifth = new Song();
        songOriginalSoundtrackDFifth.setTitle("The Chromatics – Tick Of The Clock ");

        Song songOriginalSoundtrackDSixth = new Song();
        songOriginalSoundtrackDSixth.setTitle("Cliff Martinez – Rubber Head ");

        Song songOriginalSoundtrackDSeventh = new Song();
        songOriginalSoundtrackDSeventh.setTitle("Cliff Martinez – I Drive ");

        Song songOriginalSoundtrackDEighth = new Song();
        songOriginalSoundtrackDEighth.setTitle("Cliff Martinez – He Had A Good Time ");

        Song songOriginalSoundtrackDNinth = new Song();
        songOriginalSoundtrackDNinth.setTitle("Cliff Martinez – They Broke His Pelvis ");

        Song songOriginalSoundtrackDTenth = new Song();
        songOriginalSoundtrackDTenth.setTitle("Cliff Martinez – Kick Your Teeth ");

        Song songOriginalSoundtrackDEleventh = new Song();
        songOriginalSoundtrackDEleventh.setTitle("Cliff Martinez – Where's The Deluxe Version? ");

        Song songOriginalSoundtrackDTwelfth = new Song();
        songOriginalSoundtrackDTwelfth.setTitle("Cliff Martinez – See You In Four ");

        Song songOriginalSoundtrackDThirteenth = new Song();
        songOriginalSoundtrackDThirteenth.setTitle("Cliff Martinez – After The Chase ");

        Song songOriginalSoundtrackDFourteenth = new Song();
        songOriginalSoundtrackDFourteenth.setTitle("Cliff Martinez –Hammer ");

        Song songOriginalSoundtrackDFifteenth = new Song();
        songOriginalSoundtrackDFifteenth.setTitle("Cliff Martinez – Wrong Floor ");

        Song songOriginalSoundtrackDSixteenth = new Song();
        songOriginalSoundtrackDSixteenth.setTitle("Cliff Martinez – Skull Crushing ");

        Song songOriginalSoundtrackDSeventeenth = new Song();
        songOriginalSoundtrackDSeventeenth.setTitle("Cliff Martinez – My Name On A Car ");

        Song songOriginalSoundtrackDEighteenth = new Song();
        songOriginalSoundtrackDEighteenth.setTitle("Cliff Martinez – On The Beach ");

        Song songOriginalSoundtrackDNineteenth = new Song();
        songOriginalSoundtrackDNineteenth.setTitle("Cliff Martinez – Bride Of Deluxe");

        songService.add(songOriginalSoundtrackDFirst);
        songService.add(songOriginalSoundtrackDSecond);
        songService.add(songOriginalSoundtrackDThird);
        songService.add(songOriginalSoundtrackDFourth);
        songService.add(songOriginalSoundtrackDFifth);
        songService.add(songOriginalSoundtrackDSixth);
        songService.add(songOriginalSoundtrackDSeventh);
        songService.add(songOriginalSoundtrackDEighth);
        songService.add(songOriginalSoundtrackDNinth);
        songService.add(songOriginalSoundtrackDTenth);
        songService.add(songOriginalSoundtrackDEleventh);
        songService.add(songOriginalSoundtrackDTwelfth);
        songService.add(songOriginalSoundtrackDThirteenth);
        songService.add(songOriginalSoundtrackDFourteenth);
        songService.add(songOriginalSoundtrackDFifteenth);
        songService.add(songOriginalSoundtrackDSixteenth);
        songService.add(songOriginalSoundtrackDSeventeenth);
        songService.add(songOriginalSoundtrackDEighteenth);
        songService.add(songOriginalSoundtrackDNineteenth);

        Record recordOriginalSoundtrackD = new Record();
        recordOriginalSoundtrackD.setPerformer("Original Soundtrack");
        recordOriginalSoundtrackD.setTitleAlbum("Drive");
        recordOriginalSoundtrackD.setGenre("Original Soundtrack");
        recordOriginalSoundtrackD.setYear("2017");
        recordOriginalSoundtrackD.setCountry("USA");
        recordOriginalSoundtrackD.setLabel("Lakeshore");
        recordOriginalSoundtrackD.setSongList(List.of(songOriginalSoundtrackDFirst,
                songOriginalSoundtrackDSecond, songOriginalSoundtrackDThird,
                songOriginalSoundtrackDFourth, songOriginalSoundtrackDFifth,
                songOriginalSoundtrackDSixth, songOriginalSoundtrackDSeventh,
                songOriginalSoundtrackDEighth, songOriginalSoundtrackDNinth,
                songOriginalSoundtrackDTenth, songOriginalSoundtrackDEleventh,
                songOriginalSoundtrackDTwelfth, songOriginalSoundtrackDThirteenth,
                songOriginalSoundtrackDFourteenth, songOriginalSoundtrackDFifteenth,
                songOriginalSoundtrackDSixteenth, songOriginalSoundtrackDSeventeenth,
                songOriginalSoundtrackDEighteenth, songOriginalSoundtrackDNineteenth));
        recordOriginalSoundtrackD.setPrice(1800.0);
        recordOriginalSoundtrackD.setDiscount(0.0);
        recordOriginalSoundtrackD.setPictureUrl("https://i.ibb.co/RN2fZJK/"
                + "24-Original-Soundtrack-Drive.jpg");
        recordOriginalSoundtrackD.setFormat("2 LP");
        recordOriginalSoundtrackD.setColor("Gold Vinyl Edition");

        recordService.add(recordOriginalSoundtrackD);

        // 25. L'entourloop record

        Song songLentourloopFirst = new Song();
        songLentourloopFirst.setTitle("La clarté dans la confusion ft. N’Zeng");

        Song songLentourloopSecond = new Song();
        songLentourloopSecond.setTitle("Calling Dancers ft. Alborosie & Promoe");

        Song songLentourloopThird = new Song();
        songLentourloopThird.setTitle("Rock Mi Nice ft. Kabaka Pyramid");

        Song songLentourloopFourth = new Song();
        songLentourloopFourth.setTitle("Madzilla ft. Troy Berkley & Blabbermouf");

        Song songLentourloopFifth = new Song();
        songLentourloopFifth.setTitle("Eternal Roses ft. Ken Boothe & Lion in Bed");

        Song songLentourloopSixth = new Song();
        songLentourloopSixth.setTitle("Florilège ft. Lyricson, Queen Omega & Red Fox");

        Song songLentourloopSeventh = new Song();
        songLentourloopSeventh.setTitle("Drop ft. Troy Berkley & Dope Saint Jude");

        Song songLentourloopEighth = new Song();
        songLentourloopEighth.setTitle("La fleur de l’âge ft. Degiheugi");

        Song songLentourloopNinth = new Song();
        songLentourloopNinth.setTitle("People is Massive ft. General Levy");

        Song songLentourloopTenth = new Song();
        songLentourloopTenth.setTitle("Scoville Anthem ft. LMK, Reverie & Lady Chann");

        Song songLentourloopEleventh = new Song();
        songLentourloopEleventh.setTitle("Magistral ft. Bounty Killer & Troy Berkley");

        Song songLentourloopTwelfth = new Song();
        songLentourloopTwelfth.setTitle("Clin d’oeil ft. Dawa & The Architect");

        Song songLentourloopThirteenth = new Song();
        songLentourloopThirteenth.setTitle("Get Back ft. Chali 2Na & N’Zeng");

        Song songLentourloopFourteenth = new Song();
        songLentourloopFourteenth.setTitle("Mana ft. Marcus Gad & JuJu Rogers");

        Song songLentourloopFifteenth = new Song();
        songLentourloopFifteenth.setTitle("Lift Up Your Head ft. Troy Berkley & O.B.F");

        Song songLentourloopSixteenth = new Song();
        songLentourloopSixteenth.setTitle("Way to Be Happy ft. Las Ninyas del Corro");

        Song songLentourloopSeventeenth = new Song();
        songLentourloopSeventeenth.setTitle("Fi Di Yut ft. Blackout JA & Tippa Irie");

        Song songLentourloopEighteenth = new Song();
        songLentourloopEighteenth.setTitle("Mumbai 808 ft. Manudigital");

        Song songLentourloopNineteenth = new Song();
        songLentourloopNineteenth.setTitle("Saga ft. Killa P, Flowdan & Big Red");

        Song songLentourloopTwentieth = new Song();
        songLentourloopTwentieth.setTitle("Downtown (Befour Steppa)");

        songService.add(songLentourloopFirst);
        songService.add(songLentourloopSecond);
        songService.add(songLentourloopThird);
        songService.add(songLentourloopFourth);
        songService.add(songLentourloopFifth);
        songService.add(songLentourloopSixth);
        songService.add(songLentourloopSeventh);
        songService.add(songLentourloopEighth);
        songService.add(songLentourloopNinth);
        songService.add(songLentourloopTenth);
        songService.add(songLentourloopEleventh);
        songService.add(songLentourloopTwelfth);
        songService.add(songLentourloopThirteenth);
        songService.add(songLentourloopFourteenth);
        songService.add(songLentourloopFifteenth);
        songService.add(songLentourloopSixteenth);
        songService.add(songLentourloopSeventeenth);
        songService.add(songLentourloopEighteenth);
        songService.add(songLentourloopNineteenth);
        songService.add(songLentourloopTwentieth);

        Record recordLentourloop = new Record();
        recordLentourloop.setPerformer("L'entourloop");
        recordLentourloop.setTitleAlbum("La Clarte Dans La Confusion");
        recordLentourloop.setGenre("Electronic");
        recordLentourloop.setYear("2022");
        recordLentourloop.setCountry("Holland");
        recordLentourloop.setLabel("Cargo Uk");
        recordLentourloop.setSongList(List.of(songLentourloopFirst, songLentourloopSecond,
                songLentourloopThird, songLentourloopFourth, songLentourloopFifth,
                songLentourloopSixth, songLentourloopSeventh, songLentourloopEighth,
                songLentourloopNinth, songLentourloopTenth, songLentourloopEleventh,
                songLentourloopTwelfth, songLentourloopThirteenth, songLentourloopFourteenth,
                songLentourloopFifteenth, songLentourloopSixteenth, songLentourloopSeventeenth,
                songLentourloopEighteenth, songLentourloopNineteenth, songLentourloopTwentieth));
        recordLentourloop.setPrice(1491.0);
        recordLentourloop.setDiscount(0.0);
        recordLentourloop.setPictureUrl("https://i.ibb.co/0fnZjWG/"
                + "25-L-entourloop-La-Clarte-Dans-La-Confusion.jpg");
        recordLentourloop.setFormat("2 LP");
        recordLentourloop.setColor("Black 180gr Vinyl");

        recordService.add(recordLentourloop);

        // 26. Original Soundtrack - Secret Life Of Walter Mitty record

        Song songOriginalSoundtrackSecretLifeOfWalterMittyFirst = new Song();
        songOriginalSoundtrackSecretLifeOfWalterMittyFirst.setTitle("Walter Time");

        Song songOriginalSoundtrackSecretLifeOfWalterMittySecond = new Song();
        songOriginalSoundtrackSecretLifeOfWalterMittySecond.setTitle("Building Rescue");

        Song songOriginalSoundtrackSecretLifeOfWalterMittyThird = new Song();
        songOriginalSoundtrackSecretLifeOfWalterMittyThird.setTitle("Time & Life");

        Song songOriginalSoundtrackSecretLifeOfWalterMittyFourth = new Song();
        songOriginalSoundtrackSecretLifeOfWalterMittyFourth.setTitle("Walter Sees Cheryl");

        Song songOriginalSoundtrackSecretLifeOfWalterMittyFifth = new Song();
        songOriginalSoundtrackSecretLifeOfWalterMittyFifth.setTitle("Arctic Fantasy");

        Song songOriginalSoundtrackSecretLifeOfWalterMittySixth = new Song();
        songOriginalSoundtrackSecretLifeOfWalterMittySixth.setTitle("Paperclip");

        Song songOriginalSoundtrackSecretLifeOfWalterMittySeventh = new Song();
        songOriginalSoundtrackSecretLifeOfWalterMittySeventh.setTitle("Wallet");

        Song songOriginalSoundtrackSecretLifeOfWalterMittyEighth = new Song();
        songOriginalSoundtrackSecretLifeOfWalterMittyEighth.setTitle("Clue #1");

        Song songOriginalSoundtrackSecretLifeOfWalterMittyNinth = new Song();
        songOriginalSoundtrackSecretLifeOfWalterMittyNinth.setTitle("Dangling Piano");

        Song songOriginalSoundtrackSecretLifeOfWalterMittyTenth = new Song();
        songOriginalSoundtrackSecretLifeOfWalterMittyTenth.setTitle("Clue #2");

        Song songOriginalSoundtrackSecretLifeOfWalterMittyEleventh = new Song();
        songOriginalSoundtrackSecretLifeOfWalterMittyEleventh.setTitle("Ted Vs Walter");

        Song songOriginalSoundtrackSecretLifeOfWalterMittyTwelfth = new Song();
        songOriginalSoundtrackSecretLifeOfWalterMittyTwelfth.setTitle("Sixth Avenue");

        Song songOriginalSoundtrackSecretLifeOfWalterMittyThirteenth = new Song();
        songOriginalSoundtrackSecretLifeOfWalterMittyThirteenth.setTitle("Button");

        Song songOriginalSoundtrackSecretLifeOfWalterMittyFourteenth = new Song();
        songOriginalSoundtrackSecretLifeOfWalterMittyFourteenth.setTitle("The Beckoning");

        Song songOriginalSoundtrackSecretLifeOfWalterMittyFifteenth = new Song();
        songOriginalSoundtrackSecretLifeOfWalterMittyFifteenth.setTitle("Pub Decision");

        Song songOriginalSoundtrackSecretLifeOfWalterMittySixteenth = new Song();
        songOriginalSoundtrackSecretLifeOfWalterMittySixteenth.setTitle("Shark Attack");

        Song songOriginalSoundtrackSecretLifeOfWalterMittySeventeenth = new Song();
        songOriginalSoundtrackSecretLifeOfWalterMittySeventeenth.setTitle("Into The Harbor");

        Song songOriginalSoundtrackSecretLifeOfWalterMittyEighteenth = new Song();
        songOriginalSoundtrackSecretLifeOfWalterMittyEighteenth.setTitle("Eyjafjallajökull");

        Song songOriginalSoundtrackSecretLifeOfWalterMittyNineteenth = new Song();
        songOriginalSoundtrackSecretLifeOfWalterMittyNineteenth.setTitle("Eruption");

        Song songOriginalSoundtrackSecretLifeOfWalterMittyTwentieth = new Song();
        songOriginalSoundtrackSecretLifeOfWalterMittyTwentieth.setTitle("Cup Reminders");

        Song songOriginalSoundtrackSecretLifeOfWalterMittyTwentyFirst = new Song();
        songOriginalSoundtrackSecretLifeOfWalterMittyTwentyFirst.setTitle("Skateboard Delivery");

        Song songOriginalSoundtrackSecretLifeOfWalterMittyTwentySecond = new Song();
        songOriginalSoundtrackSecretLifeOfWalterMittyTwentySecond.setTitle("Conan Cab");

        Song songOriginalSoundtrackSecretLifeOfWalterMittyTwentyThird = new Song();
        songOriginalSoundtrackSecretLifeOfWalterMittyTwentyThird.setTitle("You Finish His Work");

        Song songOriginalSoundtrackSecretLifeOfWalterMittyTwentyFourth = new Song();
        songOriginalSoundtrackSecretLifeOfWalterMittyTwentyFourth.setTitle("Afghan Trek");

        Song songOriginalSoundtrackSecretLifeOfWalterMittyTwentyFifth = new Song();
        songOriginalSoundtrackSecretLifeOfWalterMittyTwentyFifth.setTitle("Quintessence");

        Song songOriginalSoundtrackSecretLifeOfWalterMittyTwentySixth = new Song();
        songOriginalSoundtrackSecretLifeOfWalterMittyTwentySixth.setTitle("I'm Right Here");

        Song songOriginalSoundtrackSecretLifeOfWalterMittyTwentySeventh = new Song();
        songOriginalSoundtrackSecretLifeOfWalterMittyTwentySeventh.setTitle("Stationary Cycle");

        songService.add(songOriginalSoundtrackSecretLifeOfWalterMittyFirst);
        songService.add(songOriginalSoundtrackSecretLifeOfWalterMittySecond);
        songService.add(songOriginalSoundtrackSecretLifeOfWalterMittyThird);
        songService.add(songOriginalSoundtrackSecretLifeOfWalterMittyFourth);
        songService.add(songOriginalSoundtrackSecretLifeOfWalterMittyFifth);
        songService.add(songOriginalSoundtrackSecretLifeOfWalterMittySixth);
        songService.add(songOriginalSoundtrackSecretLifeOfWalterMittySeventh);
        songService.add(songOriginalSoundtrackSecretLifeOfWalterMittyEighth);
        songService.add(songOriginalSoundtrackSecretLifeOfWalterMittyNinth);
        songService.add(songOriginalSoundtrackSecretLifeOfWalterMittyTenth);
        songService.add(songOriginalSoundtrackSecretLifeOfWalterMittyEleventh);
        songService.add(songOriginalSoundtrackSecretLifeOfWalterMittyTwelfth);
        songService.add(songOriginalSoundtrackSecretLifeOfWalterMittyThirteenth);
        songService.add(songOriginalSoundtrackSecretLifeOfWalterMittyFourteenth);
        songService.add(songOriginalSoundtrackSecretLifeOfWalterMittyFifteenth);
        songService.add(songOriginalSoundtrackSecretLifeOfWalterMittySixteenth);
        songService.add(songOriginalSoundtrackSecretLifeOfWalterMittySeventeenth);
        songService.add(songOriginalSoundtrackSecretLifeOfWalterMittyEighteenth);
        songService.add(songOriginalSoundtrackSecretLifeOfWalterMittyNineteenth);
        songService.add(songOriginalSoundtrackSecretLifeOfWalterMittyTwentieth);
        songService.add(songOriginalSoundtrackSecretLifeOfWalterMittyTwentyFirst);
        songService.add(songOriginalSoundtrackSecretLifeOfWalterMittyTwentySecond);
        songService.add(songOriginalSoundtrackSecretLifeOfWalterMittyTwentyThird);
        songService.add(songOriginalSoundtrackSecretLifeOfWalterMittyTwentyFourth);
        songService.add(songOriginalSoundtrackSecretLifeOfWalterMittyTwentyFifth);
        songService.add(songOriginalSoundtrackSecretLifeOfWalterMittyTwentySixth);
        songService.add(songOriginalSoundtrackSecretLifeOfWalterMittyTwentySeventh);

        Record recordOriginalSoundtrackSecretLifeOfWalterMitty = new Record();
        recordOriginalSoundtrackSecretLifeOfWalterMitty.setPerformer("Original Soundtrack");
        recordOriginalSoundtrackSecretLifeOfWalterMitty
                .setTitleAlbum("Secret Life Of Walter Mitty");
        recordOriginalSoundtrackSecretLifeOfWalterMitty.setGenre("Original Soundtrack");
        recordOriginalSoundtrackSecretLifeOfWalterMitty.setYear("2015");
        recordOriginalSoundtrackSecretLifeOfWalterMitty.setCountry("Holland");
        recordOriginalSoundtrackSecretLifeOfWalterMitty.setLabel("Music On Vinyl");
        recordOriginalSoundtrackSecretLifeOfWalterMitty.setSongList(List.of(
                songOriginalSoundtrackSecretLifeOfWalterMittyFirst,
                songOriginalSoundtrackSecretLifeOfWalterMittySecond,
                songOriginalSoundtrackSecretLifeOfWalterMittyThird,
                songOriginalSoundtrackSecretLifeOfWalterMittyFourth,
                songOriginalSoundtrackSecretLifeOfWalterMittyFifth,
                songOriginalSoundtrackSecretLifeOfWalterMittySixth,
                songOriginalSoundtrackSecretLifeOfWalterMittySeventh,
                songOriginalSoundtrackSecretLifeOfWalterMittyEighth,
                songOriginalSoundtrackSecretLifeOfWalterMittyNinth,
                songOriginalSoundtrackSecretLifeOfWalterMittyTenth,
                songOriginalSoundtrackSecretLifeOfWalterMittyEleventh,
                songOriginalSoundtrackSecretLifeOfWalterMittyTwelfth,
                songOriginalSoundtrackSecretLifeOfWalterMittyThirteenth,
                songOriginalSoundtrackSecretLifeOfWalterMittyFourteenth,
                songOriginalSoundtrackSecretLifeOfWalterMittyFifteenth,
                songOriginalSoundtrackSecretLifeOfWalterMittySixteenth,
                songOriginalSoundtrackSecretLifeOfWalterMittySeventeenth,
                songOriginalSoundtrackSecretLifeOfWalterMittyEighteenth,
                songOriginalSoundtrackSecretLifeOfWalterMittyNineteenth,
                songOriginalSoundtrackSecretLifeOfWalterMittyTwentieth,
                songOriginalSoundtrackSecretLifeOfWalterMittyTwentyFirst,
                songOriginalSoundtrackSecretLifeOfWalterMittyTwentySecond,
                songOriginalSoundtrackSecretLifeOfWalterMittyTwentyThird,
                songOriginalSoundtrackSecretLifeOfWalterMittyTwentyFourth,
                songOriginalSoundtrackSecretLifeOfWalterMittyTwentyFifth,
                songOriginalSoundtrackSecretLifeOfWalterMittyTwentySixth,
                songOriginalSoundtrackSecretLifeOfWalterMittyTwentySeventh
        ));
        recordOriginalSoundtrackSecretLifeOfWalterMitty.setPrice(1050.0);
        recordOriginalSoundtrackSecretLifeOfWalterMitty.setDiscount(0.0);
        recordOriginalSoundtrackSecretLifeOfWalterMitty.setPictureUrl("https://i.ibb.co/XjRRyc7/"
                + "26-Original-Soundtrack-Secrets-Life-Of-Walter-Mitty.jpg");
        recordOriginalSoundtrackSecretLifeOfWalterMitty.setFormat("1 LP");
        recordOriginalSoundtrackSecretLifeOfWalterMitty.setColor("Black 180gr Vinyl");

        recordService.add(recordOriginalSoundtrackSecretLifeOfWalterMitty);

        // 28. Sia record

        Song songSiaFirst = new Song();
        songSiaFirst.setTitle("Santa's Coming For Us");

        Song songSiaSecond = new Song();
        songSiaSecond.setTitle("Candy Cane Lane");

        Song songSiaThird = new Song();
        songSiaThird.setTitle("Snowman");

        Song songSiaFourth = new Song();
        songSiaFourth.setTitle("Snowflake");

        Song songSiaFifth = new Song();
        songSiaFifth.setTitle("Ho Ho Ho");

        Song songSiaSixth = new Song();
        songSiaSixth.setTitle("Puppies Are Forever");

        Song songSiaSeventh = new Song();
        songSiaSeventh.setTitle("Underneath The Christmas Lights");

        Song songSiaEighth = new Song();
        songSiaEighth.setTitle("Sunshine");

        Song songSiaNinth = new Song();
        songSiaNinth.setTitle("Underneath The Mistletoe");

        Song songSiaTenth = new Song();
        songSiaTenth.setTitle("Everyday Is Christmas");

        songService.add(songSiaFirst);
        songService.add(songSiaSecond);
        songService.add(songSiaThird);
        songService.add(songSiaFourth);
        songService.add(songSiaFifth);
        songService.add(songSiaSixth);
        songService.add(songSiaSeventh);
        songService.add(songSiaEighth);
        songService.add(songSiaNinth);
        songService.add(songSiaTenth);

        Record recordSia = new Record();
        recordSia.setPerformer("Sia");
        recordSia.setTitleAlbum("Everyday Is Christmas (Limited Edition)");
        recordSia.setGenre("Christmas");
        recordSia.setYear("2022");
        recordSia.setCountry("Holland");
        recordSia.setLabel("Atlantic");
        recordSia.setSongList(List.of(songSiaFirst, songSiaSecond, songSiaThird, songSiaFourth,
                songSiaFifth, songSiaSixth, songSiaSeventh, songSiaEighth, songSiaNinth,
                songSiaTenth));
        recordSia.setPrice(990.0);
        recordSia.setDiscount(0.0);
        recordSia.setPictureUrl("https://i.ibb.co/NN0cTKk/27-Sia-Everyday-is-Christmas.jpg");
        recordSia.setFormat("1 LP");
        recordSia.setColor("White Vinyl Edition");

        recordService.add(recordSia);

        // 29. Fka Twigs record

        Song songFkaTwigsFirst = new Song();
        songFkaTwigsFirst.setTitle("Ride The Dragon");

        Song songFkaTwigsSecond = new Song();
        songFkaTwigsSecond.setTitle("Honda");

        Song songFkaTwigsThird = new Song();
        songFkaTwigsThird.setTitle("Meta Angel");

        Song songFkaTwigsFourth = new Song();
        songFkaTwigsFourth.setTitle("Tears In The Club");

        Song songFkaTwigsFifth = new Song();
        songFkaTwigsFifth.setTitle("Oh My Love");

        Song songFkaTwigsSixth = new Song();
        songFkaTwigsSixth.setTitle("Pamplemousse");

        Song songFkaTwigsSeventh = new Song();
        songFkaTwigsSeventh.setTitle("Caprisongs Interlude");

        Song songFkaTwigsEighth = new Song();
        songFkaTwigsEighth.setTitle("Lightbeamers");

        Song songFkaTwigsNinth = new Song();
        songFkaTwigsNinth.setTitle("Papi Bones");

        Song songFkaTwigsTenth = new Song();
        songFkaTwigsTenth.setTitle("Which Way");

        Song songFkaTwigsEleventh = new Song();
        songFkaTwigsEleventh.setTitle("Jealousy");

        Song songFkaTwigsTwelfth = new Song();
        songFkaTwigsTwelfth.setTitle("Careless");

        Song songFkaTwigsThirteenth = new Song();
        songFkaTwigsThirteenth.setTitle("Minds Of Men");

        Song songFkaTwigsFourteenth = new Song();
        songFkaTwigsFourteenth.setTitle("Track Girl Interlude");

        Song songFkaTwigsFifteenth = new Song();
        songFkaTwigsFifteenth.setTitle("Darjeeling");

        Song songFkaTwigsSixteenth = new Song();
        songFkaTwigsSixteenth.setTitle("Christi Interlude");

        Song songFkaTwigsSeventeenth = new Song();
        songFkaTwigsSeventeenth.setTitle("Thank You Song");

        songService.add(songFkaTwigsFirst);
        songService.add(songFkaTwigsSecond);
        songService.add(songFkaTwigsThird);
        songService.add(songFkaTwigsFourth);
        songService.add(songFkaTwigsFifth);
        songService.add(songFkaTwigsSixth);
        songService.add(songFkaTwigsSeventh);
        songService.add(songFkaTwigsEighth);
        songService.add(songFkaTwigsNinth);
        songService.add(songFkaTwigsTenth);
        songService.add(songFkaTwigsEleventh);
        songService.add(songFkaTwigsTwelfth);
        songService.add(songFkaTwigsThirteenth);
        songService.add(songFkaTwigsFourteenth);
        songService.add(songFkaTwigsFifteenth);
        songService.add(songFkaTwigsSixteenth);
        songService.add(songFkaTwigsSeventeenth);

        Record recordFkaTwigs = new Record();
        recordFkaTwigs.setPerformer("Fka Twigs");
        recordFkaTwigs.setTitleAlbum("Caprisongs");
        recordFkaTwigs.setGenre("Popular");
        recordFkaTwigs.setYear("2022");
        recordFkaTwigs.setCountry("USA");
        recordFkaTwigs.setLabel("Young At Heart");
        recordFkaTwigs.setSongList(List.of(songFkaTwigsFirst, songFkaTwigsSecond, songFkaTwigsThird,
                songFkaTwigsFourth, songFkaTwigsFifth, songFkaTwigsSixth, songFkaTwigsSeventh,
                songFkaTwigsEighth, songFkaTwigsNinth, songFkaTwigsTenth, songFkaTwigsEleventh,
                songFkaTwigsTwelfth, songFkaTwigsThirteenth, songFkaTwigsFourteenth,
                songFkaTwigsFifteenth, songFkaTwigsSixteenth, songFkaTwigsSeventeenth));
        recordFkaTwigs.setPrice(1332.0);
        recordFkaTwigs.setDiscount(0.0);
        recordFkaTwigs.setPictureUrl("https://i.ibb.co/R9Gv32j/28-FKA-Twigs-Caprisongs.jpg");
        recordFkaTwigs.setFormat("1 LP");
        recordFkaTwigs.setColor("Black 180gr Vinyl");

        recordService.add(recordFkaTwigs);

        // 30. Marina & The Diamonds record

        Song songMarinaAndTheDiamondsFirst = new Song();
        songMarinaAndTheDiamondsFirst.setTitle("Bubblegum Bitch");

        Song songMarinaAndTheDiamondsSecond = new Song();
        songMarinaAndTheDiamondsSecond.setTitle("Primadonna");

        Song songMarinaAndTheDiamondsThird = new Song();
        songMarinaAndTheDiamondsThird.setTitle("Lies");

        Song songMarinaAndTheDiamondsFourth = new Song();
        songMarinaAndTheDiamondsFourth.setTitle("Homewrecker");

        Song songMarinaAndTheDiamondsFifth = new Song();
        songMarinaAndTheDiamondsFifth.setTitle("Starring Role");

        Song songMarinaAndTheDiamondsSixth = new Song();
        songMarinaAndTheDiamondsSixth.setTitle("The State of Dreaming");

        Song songMarinaAndTheDiamondsSeventh = new Song();
        songMarinaAndTheDiamondsSeventh.setTitle("Power & Control");

        Song songMarinaAndTheDiamondsEighth = new Song();
        songMarinaAndTheDiamondsEighth.setTitle("Living Dead");

        Song songMarinaAndTheDiamondsNinth = new Song();
        songMarinaAndTheDiamondsNinth.setTitle("E.V.O.L");

        Song songMarinaAndTheDiamondsTenth = new Song();
        songMarinaAndTheDiamondsTenth.setTitle("Teen Idle");

        Song songMarinaAndTheDiamondsEleventh = new Song();
        songMarinaAndTheDiamondsEleventh.setTitle("Valley of the Dolls");

        Song songMarinaAndTheDiamondsTwelfth = new Song();
        songMarinaAndTheDiamondsTwelfth.setTitle("Hypocrates");

        Song songMarinaAndTheDiamondsThirteenth = new Song();
        songMarinaAndTheDiamondsThirteenth.setTitle("Fear and Loathing");

        Song songMarinaAndTheDiamondsFourteenth = new Song();
        songMarinaAndTheDiamondsFourteenth.setTitle("How to Be a Heartbreaker");

        Song songMarinaAndTheDiamondsFifteenth = new Song();
        songMarinaAndTheDiamondsFifteenth.setTitle("Lonely Hearts Club");

        Song songMarinaAndTheDiamondsSixteenth = new Song();
        songMarinaAndTheDiamondsSixteenth.setTitle("Electra Heart");

        songService.add(songMarinaAndTheDiamondsFirst);
        songService.add(songMarinaAndTheDiamondsSecond);
        songService.add(songMarinaAndTheDiamondsThird);
        songService.add(songMarinaAndTheDiamondsFourth);
        songService.add(songMarinaAndTheDiamondsFifth);
        songService.add(songMarinaAndTheDiamondsSixth);
        songService.add(songMarinaAndTheDiamondsSeventh);
        songService.add(songMarinaAndTheDiamondsEighth);
        songService.add(songMarinaAndTheDiamondsNinth);
        songService.add(songMarinaAndTheDiamondsTenth);
        songService.add(songMarinaAndTheDiamondsEleventh);
        songService.add(songMarinaAndTheDiamondsTwelfth);
        songService.add(songMarinaAndTheDiamondsThirteenth);
        songService.add(songMarinaAndTheDiamondsFourteenth);
        songService.add(songMarinaAndTheDiamondsFifteenth);
        songService.add(songMarinaAndTheDiamondsSixteenth);

        Record recordMarinaAndTheDiamonds = new Record();
        recordMarinaAndTheDiamonds.setPerformer("Marina And The Diamonds");
        recordMarinaAndTheDiamonds
                .setTitleAlbum("Electra Heart: Platinum Blonde Edition (Limited Edition)");
        recordMarinaAndTheDiamonds.setGenre("Popular");
        recordMarinaAndTheDiamonds.setYear("2022");
        recordMarinaAndTheDiamonds.setCountry("USA / Europe");
        recordMarinaAndTheDiamonds.setLabel("Atlantic");
        recordMarinaAndTheDiamonds.setSongList(List.of(songMarinaAndTheDiamondsFirst,
                songMarinaAndTheDiamondsSecond, songMarinaAndTheDiamondsThird,
                songMarinaAndTheDiamondsFourth, songMarinaAndTheDiamondsFifth,
                songMarinaAndTheDiamondsSixth, songMarinaAndTheDiamondsSeventh,
                songMarinaAndTheDiamondsEighth, songMarinaAndTheDiamondsNinth,
                songMarinaAndTheDiamondsTenth, songMarinaAndTheDiamondsEleventh,
                songMarinaAndTheDiamondsTwelfth, songMarinaAndTheDiamondsThirteenth,
                songMarinaAndTheDiamondsFourteenth, songMarinaAndTheDiamondsFifteenth,
                songMarinaAndTheDiamondsSixteenth));
        recordMarinaAndTheDiamonds.setPrice(1800.0);
        recordMarinaAndTheDiamonds.setDiscount(0.0);
        recordMarinaAndTheDiamonds.setPictureUrl("https://i.ibb.co/PtjX6r6/"
                + "29-Marina-And-The-Diamonds-Electra-Heart.jpg");
        recordMarinaAndTheDiamonds.setFormat("2 LP");
        recordMarinaAndTheDiamonds.setColor("Magenta Vinyl Edition");

        recordService.add(recordMarinaAndTheDiamonds);

        // 31. The City Of Prague Philharmonic Orchestra record

        Song songTheCityOfPraguePhilharmonicOrchestraFirst = new Song();
        songTheCityOfPraguePhilharmonicOrchestraFirst
                .setTitle("Hedwig's Theme - The Philosopher's Stone");

        Song songTheCityOfPraguePhilharmonicOrchestraSecond = new Song();
        songTheCityOfPraguePhilharmonicOrchestraSecond
                .setTitle("Harry's Wondrous Worlds - The Philosopher's Stone");

        Song songTheCityOfPraguePhilharmonicOrchestraThird = new Song();
        songTheCityOfPraguePhilharmonicOrchestraThird
                .setTitle("Christmas at Hogwarts - The Philosopher's Stone");

        Song songTheCityOfPraguePhilharmonicOrchestraFourth = new Song();
        songTheCityOfPraguePhilharmonicOrchestraFourth
                .setTitle("Leaving Hogwarts - The Philosopher's Stone");

        Song songTheCityOfPraguePhilharmonicOrchestraFifth = new Song();
        songTheCityOfPraguePhilharmonicOrchestraFifth
                .setTitle("Double Trouble - The Prisoner of Azkaban");

        Song songTheCityOfPraguePhilharmonicOrchestraSixth = new Song();
        songTheCityOfPraguePhilharmonicOrchestraSixth
                .setTitle("A Window to the Past - The Prisoner of Azkaban");

        Song songTheCityOfPraguePhilharmonicOrchestraSeventh = new Song();
        songTheCityOfPraguePhilharmonicOrchestraSeventh
                .setTitle("Harry in Winter - The Goblet of Fire");

        Song songTheCityOfPraguePhilharmonicOrchestraEighth = new Song();
        songTheCityOfPraguePhilharmonicOrchestraEighth
                .setTitle("Professor Umbridge - The Order of the Phoenix");

        Song songTheCityOfPraguePhilharmonicOrchestraNinth = new Song();
        songTheCityOfPraguePhilharmonicOrchestraNinth
                .setTitle("Dumbledore's Farewell - The Half - Blood Prince");

        Song songTheCityOfPraguePhilharmonicOrchestraTenth = new Song();
        songTheCityOfPraguePhilharmonicOrchestraTenth
                .setTitle("Obliviate - The Deathly Hallows, Part.1");

        Song songTheCityOfPraguePhilharmonicOrchestraEleventh = new Song();
        songTheCityOfPraguePhilharmonicOrchestraEleventh
                .setTitle("Lilys Theme - The Deathly Hallows, Part.2");

        songService.add(songTheCityOfPraguePhilharmonicOrchestraFirst);
        songService.add(songTheCityOfPraguePhilharmonicOrchestraSecond);
        songService.add(songTheCityOfPraguePhilharmonicOrchestraThird);
        songService.add(songTheCityOfPraguePhilharmonicOrchestraFourth);
        songService.add(songTheCityOfPraguePhilharmonicOrchestraFifth);
        songService.add(songTheCityOfPraguePhilharmonicOrchestraSixth);
        songService.add(songTheCityOfPraguePhilharmonicOrchestraSeventh);
        songService.add(songTheCityOfPraguePhilharmonicOrchestraEighth);
        songService.add(songTheCityOfPraguePhilharmonicOrchestraNinth);
        songService.add(songTheCityOfPraguePhilharmonicOrchestraTenth);
        songService.add(songTheCityOfPraguePhilharmonicOrchestraEleventh);

        Record recordTheCityOfPraguePhilharmonicOrchestra = new Record();
        recordTheCityOfPraguePhilharmonicOrchestra
                .setPerformer("The City Of Prague Philharmonic Orchestra");
        recordTheCityOfPraguePhilharmonicOrchestra
                .setTitleAlbum("Greatest Harry Potter Film Music Collectio");
        recordTheCityOfPraguePhilharmonicOrchestra.setGenre("Original Soundtrack");
        recordTheCityOfPraguePhilharmonicOrchestra.setYear("2022");
        recordTheCityOfPraguePhilharmonicOrchestra.setCountry("Holland");
        recordTheCityOfPraguePhilharmonicOrchestra.setLabel("Diggers Factory");
        recordTheCityOfPraguePhilharmonicOrchestra.setSongList(List.of(
                songTheCityOfPraguePhilharmonicOrchestraFirst,
                songTheCityOfPraguePhilharmonicOrchestraSecond,
                songTheCityOfPraguePhilharmonicOrchestraThird,
                songTheCityOfPraguePhilharmonicOrchestraFourth,
                songTheCityOfPraguePhilharmonicOrchestraFifth,
                songTheCityOfPraguePhilharmonicOrchestraSixth,
                songTheCityOfPraguePhilharmonicOrchestraSeventh,
                songTheCityOfPraguePhilharmonicOrchestraEighth,
                songTheCityOfPraguePhilharmonicOrchestraNinth,
                songTheCityOfPraguePhilharmonicOrchestraTenth,
                songTheCityOfPraguePhilharmonicOrchestraEleventh));
        recordTheCityOfPraguePhilharmonicOrchestra.setPrice(936.0);
        recordTheCityOfPraguePhilharmonicOrchestra.setDiscount(0.0);
        recordTheCityOfPraguePhilharmonicOrchestra.setPictureUrl("https://i.ibb.co/9cdS6jW/"
                + "30-The-Greatest-Harry-Potter-Film-Music-Collection.jpg");
        recordTheCityOfPraguePhilharmonicOrchestra.setFormat("1 LP");
        recordTheCityOfPraguePhilharmonicOrchestra.setColor("Black 180gr Vinyl");

        recordService.add(recordTheCityOfPraguePhilharmonicOrchestra);

        // 34. Temptations record

        Song songTemptationsFirst = new Song();
        songTemptationsFirst.setTitle("Rudolph The Red-Nosed Reindeer");

        Song songTemptationsSecond = new Song();
        songTemptationsSecond.setTitle("My Christmas Tree");

        Song songTemptationsThird = new Song();
        songTemptationsThird.setTitle("Santa Claus Is Comin' To Town");

        Song songTemptationsFourth = new Song();
        songTemptationsFourth.setTitle("Silent Night");

        Song songTemptationsFifth = new Song();
        songTemptationsFifth.setTitle("Someday At Christmas");

        Song songTemptationsSixth = new Song();
        songTemptationsSixth.setTitle("White Christmas ");

        Song songTemptationsSeventh = new Song();
        songTemptationsSeventh.setTitle("Let It Snow");

        Song songTemptationsEighth = new Song();
        songTemptationsEighth.setTitle("Silver Bells");

        Song songTemptationsNinth = new Song();
        songTemptationsNinth.setTitle("The Christmas Song (Merry Christmas To You) ");

        Song songTemptationsTenth = new Song();
        songTemptationsTenth.setTitle("The Little Drummer Boy");

        songService.add(songTemptationsFirst);
        songService.add(songTemptationsSecond);
        songService.add(songTemptationsThird);
        songService.add(songTemptationsFourth);
        songService.add(songTemptationsFifth);
        songService.add(songTemptationsSixth);
        songService.add(songTemptationsSeventh);
        songService.add(songTemptationsEighth);
        songService.add(songTemptationsNinth);
        songService.add(songTemptationsTenth);

        Record recordTemptations = new Record();
        recordTemptations.setPerformer("Temptations");
        recordTemptations.setTitleAlbum("The Temptations' Christmas Card");
        recordTemptations.setGenre("Various Audio / Christmas");
        recordTemptations.setYear("2022");
        recordTemptations.setCountry("USA");
        recordTemptations.setLabel("Motown");
        recordTemptations.setSongList(List.of(songTemptationsFirst, songTemptationsSecond,
                songTemptationsThird, songTemptationsFourth, songTemptationsFifth,
                songTemptationsSixth, songTemptationsSeventh, songTemptationsEighth,
                songTemptationsNinth, songTemptationsTenth));
        recordTemptations.setPrice(828.0);
        recordTemptations.setDiscount(0.0);
        recordTemptations.setPictureUrl("https://i.ibb.co/pPCGnQD/"
                + "33-The-Temptations-Christmas-Card.jpg");
        recordTemptations.setFormat("1 LP");
        recordTemptations.setColor("Black 180gr Vinyl");

        recordService.add(recordTemptations);

        // 37. Ennio Morricone record

        Song songEnnioMorriconeFirst = new Song();
        songEnnioMorriconeFirst.setTitle("Regan's Theme (Exorcism II: The Heretic)");

        Song songEnnioMorriconeSecond = new Song();
        songEnnioMorriconeSecond.setTitle("Romanza (Novecento [1900])");

        Song songEnnioMorriconeThird = new Song();
        songEnnioMorriconeThird.setTitle("Main Theme (Moses the Lawgiver)");

        Song songEnnioMorriconeFourth = new Song();
        songEnnioMorriconeFourth.setTitle("Main Theme (My Name Is Nobody)");

        Song songEnnioMorriconeFifth = new Song();
        songEnnioMorriconeFifth.setTitle("Un Amico (Revolver)");

        Song songEnnioMorriconeSixth = new Song();
        songEnnioMorriconeSixth.setTitle("Duck You Sucker (A Fistful of Dynamite)");

        Song songEnnioMorriconeSeventh = new Song();
        songEnnioMorriconeSeventh.setTitle("Main Theme (The Man from Shiloh)");

        Song songEnnioMorriconeEighth = new Song();
        songEnnioMorriconeEighth.setTitle("Suite (Two Mules for Sister Sara)");

        Song songEnnioMorriconeNinth = new Song();
        songEnnioMorriconeNinth.setTitle("La Califfa (Lady Caliph)");

        Song songEnnioMorriconeTenth = new Song();
        songEnnioMorriconeTenth.setTitle("Main Theme (The Five Man Army)");

        Song songEnnioMorriconeEleventh = new Song();
        songEnnioMorriconeEleventh.setTitle("The Red Tent (The Red Tent)");

        Song songEnnioMorriconeTwelfth = new Song();
        songEnnioMorriconeTwelfth.setTitle("Main Theme (The Sicilian Clan)");

        Song songEnnioMorriconeThirteenth = new Song();
        songEnnioMorriconeThirteenth
                .setTitle("Man with the Harmonica (Once Upon a Time in the West)");

        Song songEnnioMorriconeFourteenth = new Song();
        songEnnioMorriconeFourteenth.setTitle("Jill's Theme (Once Upon a Time in the West)");

        Song songEnnioMorriconeFifteenth = new Song();
        songEnnioMorriconeFifteenth.setTitle("Overture (Guns for San Sebastian)");

        Song songEnnioMorriconeSixteenth = new Song();
        songEnnioMorriconeSixteenth.setTitle("L'Arena (The Mercenary)");

        Song songEnnioMorriconeSeventeenth = new Song();
        songEnnioMorriconeSeventeenth.setTitle("Main Title (The Good, the Bad, and the Ugly)");

        Song songEnnioMorriconeEighteenth = new Song();
        songEnnioMorriconeEighteenth
                .setTitle("The Ecstasy of Gold (The Good, the Bad, and the Ugly)");

        Song songEnnioMorriconeNineteenth = new Song();
        songEnnioMorriconeNineteenth.setTitle("Main Titles (For a Few Dollars More)");

        Song songEnnioMorriconeTwentieth = new Song();
        songEnnioMorriconeTwentieth.setTitle("A Fistful of Dollars (A Fistful of Dollars)");

        songService.add(songEnnioMorriconeFirst);
        songService.add(songEnnioMorriconeSecond);
        songService.add(songEnnioMorriconeThird);
        songService.add(songEnnioMorriconeFourth);
        songService.add(songEnnioMorriconeFifth);
        songService.add(songEnnioMorriconeSixth);
        songService.add(songEnnioMorriconeSeventh);
        songService.add(songEnnioMorriconeEighth);
        songService.add(songEnnioMorriconeNinth);
        songService.add(songEnnioMorriconeTenth);
        songService.add(songEnnioMorriconeEleventh);
        songService.add(songEnnioMorriconeTwelfth);
        songService.add(songEnnioMorriconeThirteenth);
        songService.add(songEnnioMorriconeFourteenth);
        songService.add(songEnnioMorriconeFifteenth);
        songService.add(songEnnioMorriconeSixteenth);
        songService.add(songEnnioMorriconeSeventeenth);
        songService.add(songEnnioMorriconeEighteenth);
        songService.add(songEnnioMorriconeNineteenth);
        songService.add(songEnnioMorriconeTwentieth);

        Record recordEnnioMorricone = new Record();
        recordEnnioMorricone.setPerformer("Ennio Morricone");
        recordEnnioMorricone.setTitleAlbum("Hollywood Story");
        recordEnnioMorricone.setGenre("Popular / Original Soundtrack");
        recordEnnioMorricone.setYear("2023");
        recordEnnioMorricone.setCountry("Holland");
        recordEnnioMorricone.setLabel("Diggers Factory");
        recordEnnioMorricone.setSongList(List.of(songEnnioMorriconeFirst,
                songEnnioMorriconeSecond, songEnnioMorriconeThird, songEnnioMorriconeFourth,
                songEnnioMorriconeFifth, songEnnioMorriconeSixth, songEnnioMorriconeSeventh,
                songEnnioMorriconeEighth, songEnnioMorriconeNinth, songEnnioMorriconeTenth,
                songEnnioMorriconeEleventh, songEnnioMorriconeTwelfth,
                songEnnioMorriconeThirteenth, songEnnioMorriconeFourteenth,
                songEnnioMorriconeFifteenth, songEnnioMorriconeSixteenth,
                songEnnioMorriconeSeventeenth, songEnnioMorriconeEighteenth,
                songEnnioMorriconeNineteenth, songEnnioMorriconeTwentieth));
        recordEnnioMorricone.setPrice(1500.0);
        recordEnnioMorricone.setDiscount(0.0);
        recordEnnioMorricone.setPictureUrl("https://i.ibb.co/nLcSgGZ/"
                + "36-Ennio-Marricone-Hollywood-Story.jpg");
        recordEnnioMorricone.setFormat("2 LP");
        recordEnnioMorricone.setColor("Orange Vinyl Edition");

        recordService.add(recordEnnioMorricone);

        // 38. Glass Animals record

        Song songGlassAnimalsFirst = new Song();
        songGlassAnimalsFirst.setTitle("Life Itself");

        Song songGlassAnimalsSecond = new Song();
        songGlassAnimalsSecond.setTitle("Youth");

        Song songGlassAnimalsThird = new Song();
        songGlassAnimalsThird.setTitle("Season 2 Episode 3");

        Song songGlassAnimalsFourth = new Song();
        songGlassAnimalsFourth.setTitle("Pork Soda");

        Song songGlassAnimalsFifth = new Song();
        songGlassAnimalsFifth.setTitle("Mama's Gun");

        Song songGlassAnimalsSixth = new Song();
        songGlassAnimalsSixth.setTitle("Cane Shuga");

        Song songGlassAnimalsSeventh = new Song();
        songGlassAnimalsSeventh.setTitle("[Premade Sandwiches]");

        Song songGlassAnimalsEighth = new Song();
        songGlassAnimalsEighth.setTitle("The Other Side of Paradise");

        Song songGlassAnimalsNinth = new Song();
        songGlassAnimalsNinth.setTitle("Take a Slice");

        Song songGlassAnimalsTenth = new Song();
        songGlassAnimalsTenth.setTitle("Poplar St.");

        Song songGlassAnimalsEleventh = new Song();
        songGlassAnimalsEleventh.setTitle("Agnes");

        songService.add(songGlassAnimalsFirst);
        songService.add(songGlassAnimalsSecond);
        songService.add(songGlassAnimalsThird);
        songService.add(songGlassAnimalsFourth);
        songService.add(songGlassAnimalsFifth);
        songService.add(songGlassAnimalsSixth);
        songService.add(songGlassAnimalsSeventh);
        songService.add(songGlassAnimalsEighth);
        songService.add(songGlassAnimalsNinth);
        songService.add(songGlassAnimalsTenth);
        songService.add(songGlassAnimalsEleventh);

        Record recordGlassAnimals = new Record();
        recordGlassAnimals.setPerformer("Glass Animals");
        recordGlassAnimals.setTitleAlbum("How To Be A Human Being");
        recordGlassAnimals.setGenre("Indie");
        recordGlassAnimals.setYear("2016");
        recordGlassAnimals.setCountry("Holland");
        recordGlassAnimals.setLabel("Caroline");
        recordGlassAnimals.setSongList(List.of(songGlassAnimalsFirst, songGlassAnimalsSecond,
                songGlassAnimalsThird, songGlassAnimalsFourth, songGlassAnimalsFifth,
                songGlassAnimalsSixth, songGlassAnimalsSeventh, songGlassAnimalsEighth,
                songGlassAnimalsNinth, songGlassAnimalsTenth, songGlassAnimalsEleventh));
        recordGlassAnimals.setPrice(1680.0);
        recordGlassAnimals.setDiscount(0.0);
        recordGlassAnimals.setPictureUrl("https://i.ibb.co/9HN9TYF/"
                + "37-Glass-Animals-How-To-Be-A-Human-Being.jpg");
        recordGlassAnimals.setFormat("1 LP");
        recordGlassAnimals.setColor("Black 180gr Vinyl ");

        recordService.add(recordGlassAnimals);

        // 40. Zendaya record

        Song songZendayaFirst = new Song();
        songZendayaFirst.setTitle("Replay");

        Song songZendayaSecond = new Song();
        songZendayaSecond.setTitle("Fireflies");

        Song songZendayaThird = new Song();
        songZendayaThird.setTitle("Butterflies");

        Song songZendayaFourth = new Song();
        songZendayaFourth.setTitle("Putcha Body Down");

        Song songZendayaFifth = new Song();
        songZendayaFifth.setTitle("Heaven Lost An Angel");

        Song songZendayaSixth = new Song();
        songZendayaSixth.setTitle("Cry For Love");

        Song songZendayaSeventh = new Song();
        songZendayaSeventh.setTitle("Only When You’re Close");

        Song songZendayaEighth = new Song();
        songZendayaEighth.setTitle("Bottle You Up");

        Song songZendayaNinth = new Song();
        songZendayaNinth.setTitle("Scared");

        Song songZendayaTenth = new Song();
        songZendayaTenth.setTitle("Love You Forever");

        Song songZendayaEleventh = new Song();
        songZendayaEleventh.setTitle("My Baby");

        songService.add(songZendayaFirst);
        songService.add(songZendayaSecond);
        songService.add(songZendayaThird);
        songService.add(songZendayaFourth);
        songService.add(songZendayaFifth);
        songService.add(songZendayaSixth);
        songService.add(songZendayaSeventh);
        songService.add(songZendayaEighth);
        songService.add(songZendayaNinth);
        songService.add(songZendayaTenth);
        songService.add(songZendayaEleventh);

        Record recordZendaya = new Record();
        recordZendaya.setPerformer("Zendaya");
        recordZendaya.setTitleAlbum("Zendaya (Limited Edition)");
        recordZendaya.setGenre("Popular");
        recordZendaya.setYear("2022");
        recordZendaya.setCountry("USA");
        recordZendaya.setLabel("Hollywood Records");
        recordZendaya.setSongList(List.of(songZendayaFirst, songZendayaSecond,
                songZendayaThird, songZendayaFourth, songZendayaFifth,
                songZendayaSixth, songZendayaSeventh, songZendayaEighth,
                songZendayaNinth, songZendayaTenth, songZendayaEleventh));
        recordZendaya.setPrice(3375.0);
        recordZendaya.setDiscount(0.0);
        recordZendaya.setPictureUrl("https://i.ibb.co/dmqtj0H/39-Zendaya-Zendaya.jpg");
        recordZendaya.setFormat("1 LP");
        recordZendaya.setColor("Translucent Red Vinyl Edition");

        recordService.add(recordZendaya);

        // 41. DakhaBrakha record

        Song songDakhaBrakhaFirst = new Song();
        songDakhaBrakhaFirst.setTitle("Sho Z-Pod Duba");

        Song songDakhaBrakhaSecond = new Song();
        songDakhaBrakhaSecond.setTitle("Zainka");

        Song songDakhaBrakhaThird = new Song();
        songDakhaBrakhaThird.setTitle("Divka-Marusechka");

        Song songDakhaBrakhaFourth = new Song();
        songDakhaBrakhaFourth.setTitle("Vesna");

        Song songDakhaBrakhaFifth = new Song();
        songDakhaBrakhaFifth.setTitle("Kolyskova");

        Song songDakhaBrakhaSixth = new Song();
        songDakhaBrakhaSixth.setTitle("Karpatskyi Rap");

        songService.add(songDakhaBrakhaFirst);
        songService.add(songDakhaBrakhaSecond);
        songService.add(songDakhaBrakhaThird);
        songService.add(songDakhaBrakhaFourth);
        songService.add(songDakhaBrakhaFifth);
        songService.add(songDakhaBrakhaSixth);

        Record recordDakhaBrakha = new Record();
        recordDakhaBrakha.setPerformer("DakhaBrakha");
        recordDakhaBrakha.setTitleAlbum("The Best (Part 1)");
        recordDakhaBrakha.setGenre("Folk");
        recordDakhaBrakha.setYear("2023");
        recordDakhaBrakha.setCountry("Europe");
        recordDakhaBrakha.setLabel("Aby Sho Mzk");
        recordDakhaBrakha.setSongList(List.of(songDakhaBrakhaFirst, songDakhaBrakhaSecond,
                songDakhaBrakhaThird, songDakhaBrakhaFourth, songDakhaBrakhaFifth,
                songDakhaBrakhaSixth));
        recordDakhaBrakha.setPrice(1550.0);
        recordDakhaBrakha.setDiscount(0.0);
        recordDakhaBrakha.setPictureUrl("https://i.ibb.co/rxvKkWB/40-Dakha-Brakha-The-Best.jpg");
        recordDakhaBrakha.setFormat("1 LP");
        recordDakhaBrakha.setColor("White Vinyl Edition");

        recordService.add(recordDakhaBrakha);

        // 42. Oliver Tree record

        Song songOliverTreeFirst = new Song();
        songOliverTreeFirst.setTitle("Me, Myself & I ");

        Song songOliverTreeSecond = new Song();
        songOliverTreeSecond.setTitle("1993");

        Song songOliverTreeThird = new Song();
        songOliverTreeThird.setTitle("Cash Machine");

        Song songOliverTreeFourth = new Song();
        songOliverTreeFourth.setTitle("Let Me Down");

        Song songOliverTreeFifth = new Song();
        songOliverTreeFifth.setTitle("Miracle Man");

        Song songOliverTreeSixth = new Song();
        songOliverTreeSixth.setTitle("Bury Me Alive");

        Song songOliverTreeSeventh = new Song();
        songOliverTreeSeventh.setTitle("Alien Boy");

        Song songOliverTreeEighth = new Song();
        songOliverTreeEighth.setTitle("Joke's On You!");

        Song songOliverTreeNinth = new Song();
        songOliverTreeNinth.setTitle("Again & Again");

        Song songOliverTreeTenth = new Song();
        songOliverTreeTenth.setTitle("Waste My Time");

        Song songOliverTreeEleventh = new Song();
        songOliverTreeEleventh.setTitle("Jerk");

        Song songOliverTreeTwelfth = new Song();
        songOliverTreeTwelfth.setTitle("Hurt");

        Song songOliverTreeThirteenth = new Song();
        songOliverTreeThirteenth.setTitle("Introspective");

        Song songOliverTreeFourteenth = new Song();
        songOliverTreeFourteenth.setTitle("I'm Gone");

        songService.add(songOliverTreeFirst);
        songService.add(songOliverTreeSecond);
        songService.add(songOliverTreeThird);
        songService.add(songOliverTreeFourth);
        songService.add(songOliverTreeFifth);
        songService.add(songOliverTreeSixth);
        songService.add(songOliverTreeSeventh);
        songService.add(songOliverTreeEighth);
        songService.add(songOliverTreeNinth);
        songService.add(songOliverTreeTenth);
        songService.add(songOliverTreeEleventh);
        songService.add(songOliverTreeTwelfth);
        songService.add(songOliverTreeThirteenth);
        songService.add(songOliverTreeFourteenth);

        Record recordOliverTree = new Record();
        recordOliverTree.setPerformer("Oliver Tree");
        recordOliverTree.setTitleAlbum("Ugly Is Beautiful");
        recordOliverTree.setGenre("Popular");
        recordOliverTree.setYear("2021");
        recordOliverTree.setCountry("USA");
        recordOliverTree.setLabel("Wea");
        recordOliverTree.setSongList(List.of(songOliverTreeFirst, songOliverTreeSecond,
                songOliverTreeThird, songOliverTreeFourth, songOliverTreeFifth,
                songOliverTreeSixth, songOliverTreeSeventh, songOliverTreeEighth,
                songOliverTreeNinth, songOliverTreeTenth, songOliverTreeEleventh,
                songOliverTreeTwelfth, songOliverTreeThirteenth, songOliverTreeFourteenth));
        recordOliverTree.setPrice(1308.0);
        recordOliverTree.setDiscount(0.0);
        recordOliverTree.setPictureUrl("https://i.ibb.co/s5H81S2/"
                + "41-Oliver-Tree-Ugly-is-Beautiful.jpg");
        recordOliverTree.setFormat("1 LP");
        recordOliverTree.setColor("Black 180gr Vinyl");

        recordService.add(recordOliverTree);

        // 50. Childish Gambino record

        Song songChildishGambinoFirst = new Song();
        songChildishGambinoFirst.setTitle("Sober");

        Song songChildishGambinoSecond = new Song();
        songChildishGambinoSecond.setTitle("Pop Thieves (Make It Feel Good)");

        Song songChildishGambinoThird = new Song();
        songChildishGambinoThird.setTitle("Retro (Rough)");

        Song songChildishGambinoFourth = new Song();
        songChildishGambinoFourth.setTitle("The Palisades");

        Song songChildishGambinoFifth = new Song();
        songChildishGambinoFifth.setTitle("Poke");

        Song songChildishGambinoSixth = new Song();
        songChildishGambinoSixth.setTitle("Late Night In Kauai");

        Song songChildishGambinoSeventh = new Song();
        songChildishGambinoSeventh.setTitle("V. 3005 - Beach Picnic Version");

        songService.add(songChildishGambinoFirst);
        songService.add(songChildishGambinoSecond);
        songService.add(songChildishGambinoThird);
        songService.add(songChildishGambinoFourth);
        songService.add(songChildishGambinoFifth);
        songService.add(songChildishGambinoSixth);
        songService.add(songChildishGambinoSeventh);

        Record recordChildishGambino = new Record();
        recordChildishGambino.setPerformer("Childish Gambino");
        recordChildishGambino.setTitleAlbum("Kauai");
        recordChildishGambino.setGenre("Hip-Hop");
        recordChildishGambino.setYear("2023");
        recordChildishGambino.setCountry("Holland");
        recordChildishGambino.setLabel("Membran");
        recordChildishGambino.setSongList(List.of(songChildishGambinoFirst,
                songChildishGambinoSecond, songChildishGambinoThird, songChildishGambinoFourth,
                songChildishGambinoFifth, songChildishGambinoSixth, songChildishGambinoSeventh));
        recordChildishGambino.setPrice(1197.0);
        recordChildishGambino.setDiscount(0.0);
        recordChildishGambino.setPictureUrl("https://i.ibb.co/Lv2KQtw/"
                + "49-Childish-Gambino-Kauai.jpg");
        recordChildishGambino.setFormat("1 LP");
        recordChildishGambino.setColor("Black 180gr Vinyl");

        recordService.add(recordChildishGambino);

        // 51. Måneskin record

        Song songManeskinFirst = new Song();
        songManeskinFirst.setTitle("Own My Mind");

        Song songManeskinSecond = new Song();
        songManeskinSecond.setTitle("Gossip feat. Tom Morello");

        Song songManeskinThird = new Song();
        songManeskinThird.setTitle("Time Zone");

        Song songManeskinFourth = new Song();
        songManeskinFourth.setTitle("Bla Bla Bla");

        Song songManeskinFifth = new Song();
        songManeskinFifth.setTitle("Baby Said");

        Song songManeskinSixth = new Song();
        songManeskinSixth.setTitle("Gasoline");

        Song songManeskinSeventh = new Song();
        songManeskinSeventh.setTitle("Feel");

        Song songManeskinEighth = new Song();
        songManeskinEighth.setTitle("Don’t Wanna Sleep");

        Song songManeskinNinth = new Song();
        songManeskinNinth.setTitle("Kool Kids");

        Song songManeskinTenth = new Song();
        songManeskinTenth.setTitle("If Not for You");

        Song songManeskinEleventh = new Song();
        songManeskinEleventh.setTitle("Read Your Diary");

        Song songManeskinTwelfth = new Song();
        songManeskinTwelfth.setTitle("Mark Chapman");

        Song songManeskinThirteenth = new Song();
        songManeskinThirteenth.setTitle("La Fine");

        Song songManeskinFourteenth = new Song();
        songManeskinFourteenth.setTitle("Il Dono Della Vita");

        Song songManeskinFifteenth = new Song();
        songManeskinFifteenth.setTitle("The Loneliest");

        songService.add(songManeskinFirst);
        songService.add(songManeskinSecond);
        songService.add(songManeskinThird);
        songService.add(songManeskinFourth);
        songService.add(songManeskinFifth);
        songService.add(songManeskinSixth);
        songService.add(songManeskinSeventh);
        songService.add(songManeskinEighth);
        songService.add(songManeskinNinth);
        songService.add(songManeskinTenth);
        songService.add(songManeskinEleventh);
        songService.add(songManeskinTwelfth);
        songService.add(songManeskinThirteenth);
        songService.add(songManeskinFourteenth);
        songService.add(songManeskinFifteenth);

        Record recordManeskin = new Record();
        recordManeskin.setPerformer("Måneskin");
        recordManeskin.setTitleAlbum("Rush!");
        recordManeskin.setGenre("Rock / Alternative");
        recordManeskin.setYear("2023");
        recordManeskin.setCountry("Holland");
        recordManeskin.setLabel("Rca");
        recordManeskin.setSongList(List.of(songManeskinFirst, songManeskinSecond,
                songManeskinThird, songManeskinFourth, songManeskinFifth,
                songManeskinSixth, songManeskinSeventh, songManeskinEighth,
                songManeskinNinth, songManeskinTenth, songManeskinEleventh,
                songManeskinTwelfth, songManeskinThirteenth,
                songManeskinFourteenth, songManeskinFifteenth));
        recordManeskin.setPrice(1650.0);
        recordManeskin.setDiscount(0.0);
        recordManeskin.setPictureUrl("https://i.ibb.co/NLmFyjm/50-Maneskin-Rush.jpg");
        recordManeskin.setFormat("1 LP");
        recordManeskin.setColor("White Vinyl Edition");

        recordService.add(recordManeskin);

        //52. Harry Styles record

        Song songHarryStylesFirst = new Song();
        songHarryStylesFirst.setTitle("Music For A Sushi Restaurant");

        Song songHarryStylesSecond = new Song();
        songHarryStylesSecond.setTitle("Late Night Talking");

        Song songHarryStylesThird = new Song();
        songHarryStylesThird.setTitle("Grapejuice");

        Song songHarryStylesFourth = new Song();
        songHarryStylesFourth.setTitle("As It Was");

        Song songHarryStylesFifth = new Song();
        songHarryStylesFifth.setTitle("Daylight");

        Song songHarryStylesSixth = new Song();
        songHarryStylesSixth.setTitle("Little Freak");

        Song songHarryStylesSeventh = new Song();
        songHarryStylesSeventh.setTitle("Matilda");

        Song songHarryStylesEighth = new Song();
        songHarryStylesEighth.setTitle("Cinema");

        Song songHarryStylesNinth = new Song();
        songHarryStylesNinth.setTitle("Daydreaming");

        Song songHarryStylesTenth = new Song();
        songHarryStylesTenth.setTitle("Keep Driving");

        Song songHarryStylesEleventh = new Song();
        songHarryStylesEleventh.setTitle("Satellite");

        Song songHarryStylesTwelfth = new Song();
        songHarryStylesTwelfth.setTitle("Boyfriends");

        Song songHarryStylesThirteenth = new Song();
        songHarryStylesThirteenth.setTitle("Love Of My Life");

        songService.add(songHarryStylesFirst);
        songService.add(songHarryStylesSecond);
        songService.add(songHarryStylesThird);
        songService.add(songHarryStylesFourth);
        songService.add(songHarryStylesFifth);
        songService.add(songHarryStylesSixth);
        songService.add(songHarryStylesSeventh);
        songService.add(songHarryStylesEighth);
        songService.add(songHarryStylesNinth);
        songService.add(songHarryStylesTenth);
        songService.add(songHarryStylesEleventh);
        songService.add(songHarryStylesTwelfth);
        songService.add(songHarryStylesThirteenth);

        Record recordHarryStyles = new Record();
        recordHarryStyles.setPerformer("Harry Styles");
        recordHarryStyles.setTitleAlbum("Harry’s House (Sea Glass Edition)");
        recordHarryStyles.setGenre("Popular");
        recordHarryStyles.setYear("2022");
        recordHarryStyles.setCountry("Europe");
        recordHarryStyles.setLabel("Erskine Records");
        recordHarryStyles.setSongList(List.of(songHarryStylesFirst, songHarryStylesSecond,
                songHarryStylesThird, songHarryStylesFourth, songHarryStylesFifth,
                songHarryStylesSixth, songHarryStylesSeventh, songHarryStylesEighth,
                songHarryStylesNinth, songHarryStylesTenth, songHarryStylesEleventh,
                songHarryStylesTwelfth, songHarryStylesThirteenth));
        recordHarryStyles.setPrice(1860.0);
        recordHarryStyles.setDiscount(0.0);
        recordHarryStyles.setPictureUrl("https://i.ibb.co/7S6kbN3/"
                + "51-Harry-Styles-Harry-s-House.jpg");
        recordHarryStyles.setFormat("1 LP");
        recordHarryStyles.setColor("Orange Colored Vinyl");

        recordService.add(recordHarryStyles);

        // 54. Sam Smith record

        Song songSamSmithFirst = new Song();
        songSamSmithFirst.setTitle("Love Me More");

        Song songSamSmithSecond = new Song();
        songSamSmithSecond.setTitle("No God");

        Song songSamSmithThird = new Song();
        songSamSmithThird.setTitle("Hurting Interlude");

        Song songSamSmithFourth = new Song();
        songSamSmithFourth.setTitle("Lose You");

        Song songSamSmithFifth = new Song();
        songSamSmithFifth.setTitle("Perfect");

        Song songSamSmithSixth = new Song();
        songSamSmithSixth.setTitle("Unholy");

        Song songSamSmithSeventh = new Song();
        songSamSmithSeventh.setTitle("Heavenly Sent");

        Song songSamSmithEighth = new Song();
        songSamSmithEighth.setTitle("How To Cry");

        Song songSamSmithNinth = new Song();
        songSamSmithNinth.setTitle("Six Shots");

        Song songSamSmithTenth = new Song();
        songSamSmithTenth.setTitle("Gimme");

        Song songSamSmithEleventh = new Song();
        songSamSmithEleventh.setTitle("Dorothy's Interlude");

        Song songSamSmithTwelfth = new Song();
        songSamSmithTwelfth.setTitle("I'm Not Here To Make Friends");

        Song songSamSmithThirteenth = new Song();
        songSamSmithThirteenth.setTitle("Gloria");

        Song songSamSmithFourteenth = new Song();
        songSamSmithFourteenth.setTitle("Who We Love");

        Song songSamSmithFifteenth = new Song();
        songSamSmithFifteenth.setTitle("Kissing You");

        songService.add(songSamSmithFirst);
        songService.add(songSamSmithSecond);
        songService.add(songSamSmithThird);
        songService.add(songSamSmithFourth);
        songService.add(songSamSmithFifth);
        songService.add(songSamSmithSixth);
        songService.add(songSamSmithSeventh);
        songService.add(songSamSmithEighth);
        songService.add(songSamSmithNinth);
        songService.add(songSamSmithTenth);
        songService.add(songSamSmithEleventh);
        songService.add(songSamSmithTwelfth);
        songService.add(songSamSmithThirteenth);
        songService.add(songSamSmithFourteenth);
        songService.add(songSamSmithFifteenth);

        Record recordSamSmith = new Record();
        recordSamSmith.setPerformer("Sam Smith");
        recordSamSmith.setTitleAlbum("Gloria");
        recordSamSmith.setGenre("Popular");
        recordSamSmith.setYear("2023");
        recordSamSmith.setCountry("Holland");
        recordSamSmith.setLabel("Capitol");
        recordSamSmith.setSongList(List.of(songSamSmithFirst, songSamSmithSecond,
                songSamSmithThird, songSamSmithFourth, songSamSmithFifth,
                songSamSmithSixth, songSamSmithSeventh, songSamSmithEighth,
                songSamSmithNinth, songSamSmithTenth, songSamSmithEleventh,
                songSamSmithTwelfth, songSamSmithThirteenth, songSamSmithFourteenth,
                songSamSmithFifteenth));
        recordSamSmith.setPrice(1290.0);
        recordSamSmith.setDiscount(0.0);
        recordSamSmith.setPictureUrl("https://i.ibb.co/gSjtmsj/53-Sam-Smith-Gloria.jpg");
        recordSamSmith.setFormat("1 LP");
        recordSamSmith.setColor("Black 180gr Vinyl ");

        recordService.add(recordSamSmith);

        // 55. Gorillaz record

        Song songGorillazFirst = new Song();
        songGorillazFirst.setTitle("Cracker Island");

        Song songGorillazSecond = new Song();
        songGorillazSecond.setTitle("Oil");

        Song songGorillazThird = new Song();
        songGorillazThird.setTitle("The Tired Influencer");

        Song songGorillazFourth = new Song();
        songGorillazFourth.setTitle("Tarantula");

        Song songGorillazFifth = new Song();
        songGorillazFifth.setTitle("Silent Running");

        Song songGorillazSixth = new Song();
        songGorillazSixth.setTitle("New Gold");

        Song songGorillazSeventh = new Song();
        songGorillazSeventh.setTitle("Baby Queen");

        Song songGorillazEighth = new Song();
        songGorillazEighth.setTitle("Tormenta");

        Song songGorillazNinth = new Song();
        songGorillazNinth.setTitle("Skinny Ape");

        Song songGorillazTenth = new Song();
        songGorillazTenth.setTitle("Possession Island");

        songService.add(songGorillazFirst);
        songService.add(songGorillazSecond);
        songService.add(songGorillazThird);
        songService.add(songGorillazFourth);
        songService.add(songGorillazFifth);
        songService.add(songGorillazSixth);
        songService.add(songGorillazSeventh);
        songService.add(songGorillazEighth);
        songService.add(songGorillazNinth);
        songService.add(songGorillazTenth);

        Record recordGorillaz = new Record();
        recordGorillaz.setPerformer("Gorillaz");
        recordGorillaz.setTitleAlbum("Cracker Island");
        recordGorillaz.setGenre("Alternative Rock");
        recordGorillaz.setYear("2023");
        recordGorillaz.setCountry("USA / Europe");
        recordGorillaz.setLabel("Warner");
        recordGorillaz.setSongList(List.of(songGorillazFirst, songGorillazSecond,
                songGorillazThird, songGorillazFourth, songGorillazFifth,
                songGorillazSixth, songGorillazSeventh, songGorillazEighth,
                songGorillazNinth, songGorillazTenth));
        recordGorillaz.setPrice(1680.0);
        recordGorillaz.setDiscount(0.0);
        recordGorillaz.setPictureUrl("https://i.ibb.co/gF5X1hm/54-Gorillaz-Craker-Island.jpg");
        recordGorillaz.setFormat("1 LP");
        recordGorillaz.setColor("Red Opaque Plum Vinyl Edition");

        recordService.add(recordGorillaz);

        //        Black 180gr Vinyl                       record
        //        private Long id;                      1. First
        //        private String performer;             2. Second
        //        private String titleAlbum;            3. Third
        //        private String genre;                 4. Fourth
        //        private String year;                  5. Fifth
        //        private String country;               6. Sixth
        //        private String label;                 7. Seventh
        //        private List<Long> songsIds;          8. Eighth
        //        private Double price;                 9. Ninth
        //        private Double discount;             10. Tenth
        //        private String pictureUrl;           11. Eleventh
        //        private String format;               12. Twelfth
        //        private String color;                13. Thirteenth
        //                                             14. Fourteenth
        //                                             15. Fifteenth
        //                                             16. Sixteenth
        //                                             17. Seventeenth
        //                                             18. Eighteenth
        //                                             19. Nineteenth
        //                                             20. Twentieth

    }
}
