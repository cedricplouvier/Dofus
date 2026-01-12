import org.sikuli.script.*;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    /* All Images have been taken in 1280x800. Make sure to use the same resolution for images to be recognized
    Some images are related to a game character and screenshots need to be renewed to function for your account
     */

    static String imagePath = "/Users/cedricplouvier/Documents/Dofus/DofusBots/DofusBots/src/main/resources/img/";

    static Pattern fleurDeChanvre = new Pattern(imagePath + "fleurDeChanvre.png").similar((float) 0.8);
    static Pattern phenix = new Pattern(imagePath + "phenix.png").similar((float) 0.8);
    static Pattern abondonner = new Pattern(imagePath + "abondonner.png").similar((float) 0.8);
    static Pattern couper = new Pattern(imagePath + "couper.png").similar((float) 0.8);
    static Pattern arbreNoyer = new Pattern(imagePath + "arbreNoyer.png").similar((float) 0.8);
    static Pattern arbreChataignier = new Pattern(imagePath + "arbreChataignier.png").similar((float) 0.8);
    static Pattern arbreFrene = new Pattern(imagePath + "arbreFrene.png").similar((float) 0.8);
    static Pattern arbreChene = new Pattern(imagePath + "arbreChene.png").similar((float) 0.8);
    static Pattern abraBack = new Pattern(imagePath + "abraBack.png").similar((float) 0.8);
    static Pattern abraLeft = new Pattern(imagePath + "abraLeft.png").similar((float) 0.8);
    static Pattern abraRight = new Pattern(imagePath + "abraRight.png").similar((float) 0.8);
    static Pattern abraFront = new Pattern(imagePath + "abraFront.png").similar((float) 0.8);
    static Pattern abraFight = new Pattern(imagePath + "abraFight.png").similar((float) 0.8);
    static Pattern fermerCombat = new Pattern(imagePath + "fermerCombat.png").similar((float) 0.8);
    static Pattern options = new Pattern(imagePath + "options.png").similar((float) 0.78);
    static Pattern tropCharge = new Pattern(imagePath + "tropCharge.png").similar((float) 0.80);
    static Pattern popoRappel = new Pattern(imagePath + "popoRappel.png").similar((float) 0.80);
    static Pattern popoBonta = new Pattern(imagePath + "popoBonta.png").similar((float) 0.80);
    static Pattern popoBontaInventaire = new Pattern(imagePath + "popoBontaInventaire.png").similar((float) 0.80);
    static Pattern popoBrak = new Pattern(imagePath + "popoBrak.png").similar((float) 0.80);
    static Pattern fiolePandaPils = new Pattern(imagePath + "fiolePandaPils.png").similar((float) 0.80);
    static Pattern entreMaison = new Pattern(imagePath + "entreMaison.png").similar((float) 0.80);
    static Pattern delock = new Pattern(imagePath + "delock.png").similar((float) 0.80);
    static Pattern ouvreCoffre = new Pattern(imagePath + "ouvreCoffre.png").similar((float) 0.80);
    static Pattern coffreOuvertKamas = new Pattern(imagePath + "coffreOuvertKamas.png").similar((float) 0.80);
    static Pattern coffreMaisonGauche = new Pattern(imagePath + "coffreMaisonGauche.png").similar((float) 0.80);
    static Pattern coffreMaisonDroite = new Pattern(imagePath + "coffreMaisonDroite.png").similar((float) 0.80);
    static Pattern optionMenu = new Pattern(imagePath + "optionMenu.png").similar((float) 0.80);
    static Pattern menuPrincipal = new Pattern(imagePath + "menuPrincipal.png").similar((float) 0.80);
    static Pattern ressourceInventaire = new Pattern(imagePath + "ressourceInventaire.png").similar((float) 0.80);
    static Pattern bworky = new Pattern(imagePath + "bworky.png").similar((float) 0.80);
    static Pattern arrowInventaire = new Pattern(imagePath + "arrowInventaire.png").similar((float) 0.80);
    static Pattern familierInventaire = new Pattern(imagePath + "familierInventaire.png").similar((float) 0.80);
    static Pattern swordInventaire = new Pattern(imagePath + "swordInventaire.png").similar((float) 0.80);
    static Pattern max = new Pattern(imagePath + "max.png").similar((float) 0.80);
    static Pattern check = new Pattern(imagePath + "check.png").similar((float) 0.80);
    static Pattern close = new Pattern(imagePath + "close.png").similar((float) 0.80);
    static Pattern zaapChateau = new Pattern(imagePath + "zaapChateau.png").similar((float) 0.80);
    static Pattern zaapAstrub = new Pattern(imagePath + "zaapAstrub.png").similar((float) 0.80);
    static Pattern utiliser = new Pattern(imagePath + "utiliser.png").similar((float) 0.80);
    static Pattern selectZaapViVi = new Pattern(imagePath + "selectZaapViVi.png").similar((float) 0.80);
    static Pattern selectZaapMili = new Pattern(imagePath + "selectZaapMili.png").similar((float) 0.80);
    static Pattern zaapiBouchers = new Pattern(imagePath + "zaapiBouchers.png").similar((float) 0.80);
    static Pattern milifutaie = new Pattern(imagePath + "milifutaie.png").similar((float) 0.80);
    static Pattern selectZaapScara = new Pattern(imagePath + "selectZaapScara.png").similar((float) 0.80);
    static Pattern oui = new Pattern(imagePath + "oui.png").similar((float) 0.80);
    static Pattern pykur = new Pattern(imagePath + "pykur.png").similar((float) 0.80);
    static Pattern nomoon = new Pattern(imagePath + "nomoon.png").similar((float) 0.80);
    static Pattern ambre = new Pattern(imagePath + "ambre.png").similar((float) 0.80);
    static Pattern ambreAbra = new Pattern(imagePath + "ambreAbra.png").similar((float) 0.80);
    static Pattern boisEnvoute = new Pattern(imagePath + "boisEnvoute.png").similar((float) 0.80);
    static Pattern bourgeonAbra = new Pattern(imagePath + "bourgeonAbra.png").similar((float) 0.80);
    static Pattern clefAbra = new Pattern(imagePath + "clefAbra.png").similar((float) 0.80);
    static Pattern racineAbra = new Pattern(imagePath + "racineAbra.png").similar((float) 0.80);
    static Pattern seveAbra = new Pattern(imagePath + "seveAbra.png").similar((float) 0.80);
    static Pattern abraGlands = new Pattern(imagePath + "abraGlands.png").similar((float) 0.80);
    static Pattern ecorceAbra = new Pattern(imagePath + "ecorceAbra.png").similar((float) 0.80);
    static Pattern epeeCombat = new Pattern(imagePath + "epeeCombat.png").similar((float) 0.80);
    static Pattern passerTour = new Pattern(imagePath + "passerTour.png").similar((float) 0.80);
    static Pattern ennemiCombat = new Pattern(imagePath + "ennemiCombat.png").similar((float) 0.95);
    static Pattern allieCombat = new Pattern(imagePath + "allieCombat.png").similar((float) 0.80);
    static Pattern minerai = new Pattern(imagePath + "minerai.png").similar((float) 0.80);
    static Pattern argent = new Pattern(imagePath + "argent.png").similar((float) 0.80);
    static Pattern bauxite = new Pattern(imagePath + "bauxite.png").similar((float) 0.80);
    static Pattern kobalte = new Pattern(imagePath + "kobalte.png").similar((float) 0.80);
    static Pattern bronze = new Pattern(imagePath + "bronze.png").similar((float) 0.80);
    static Pattern cuivre = new Pattern(imagePath + "cuivre.png").similar((float) 0.80);
    static Pattern etain = new Pattern(imagePath + "etain.png").similar((float) 0.80);
    static Pattern forgerEpee = new Pattern(imagePath + "forgerEpee.png").similar((float) 0.80);
    static Pattern forgerHache = new Pattern(imagePath + "forgerHache.png").similar((float) 0.80);
    static Pattern sculpterArc = new Pattern(imagePath + "sculpterArc.png").similar((float) 0.80);
    static Pattern sculpterBaton = new Pattern(imagePath + "sculpterBaton.png").similar((float) 0.80);
    static Pattern sculpterBaguette = new Pattern(imagePath + "sculpterBaguette.png").similar((float) 0.80);
    static Pattern craftAnneau = new Pattern(imagePath + "craftAnneau.png").similar((float) 0.80);
    static Pattern craftAmu = new Pattern(imagePath + "craftAmu.png").similar((float) 0.80);
    static Pattern briserObjet = new Pattern(imagePath + "briserObjet.png").similar((float) 0.80);
    static Pattern ficelleLin = new Pattern(imagePath + "ficelleLin.png").similar((float) 0.80);
    static Pattern arcEco = new Pattern(imagePath + "arcEco.png").similar((float) 0.80);
    static Pattern batonDakn = new Pattern(imagePath + "batonDakn.png").similar((float) 0.80);
    static Pattern maxCraft = new Pattern(imagePath + "maxCraft.png").similar((float) 0.80);

    static Pattern arakneBack = new Pattern(imagePath + "arakneBackInv.png").similar((float) 0.78);
    static Pattern arakneLeft = new Pattern(imagePath + "arakneLeftInv.png").similar((float) 0.80);
    static Pattern arakneRight = new Pattern(imagePath + "arakneRightInv.png").similar((float) 0.78);
    static Pattern arakneFront = new Pattern(imagePath + "arakneFrontInv.png").similar((float) 0.78);
    static Pattern poudre = new Pattern(imagePath + "poudre.png").similar((float) 0.80);
    static Pattern patteArak = new Pattern(imagePath + "patteArak.png").similar((float) 0.80);
    static Pattern aileMoskito = new Pattern(imagePath + "aileMoskito.png").similar((float) 0.80);
    static Pattern sourcilMoskito = new Pattern(imagePath + "sourcilMoskito.png").similar((float) 0.80);
    static Pattern epineChamp = new Pattern(imagePath + "epineChamp.png").similar((float) 0.80);
    static Pattern grainePavot = new Pattern(imagePath + "grainePavot.png").similar((float) 0.80);
    static Pattern champignon = new Pattern(imagePath + "champignon.png").similar((float) 0.76);
    static Pattern sadiFight = new Pattern(imagePath + "sadiFight.png").similar((float) 0.90);;
    static Pattern moskitoFront = new Pattern(imagePath + "moskitoFront.png").similar((float) 0.78);
    static Pattern moskitoLeft = new Pattern(imagePath + "moskitoLeft.png").similar((float) 0.78);
    static Pattern moskitoBack = new Pattern(imagePath + "moskitoBack.png").similar((float) 0.78);
    static Pattern moskitoRight = new Pattern(imagePath + "moskitoRight.png").similar((float) 0.78);
    static Pattern champChamp = new Pattern(imagePath + "champChamp.png").similar((float) 0.78);
    static Pattern champChamp2 = new Pattern(imagePath + "champChamp2.png").similar((float) 0.78);
    static Pattern champChamp3 = new Pattern(imagePath + "champChamp3.png").similar((float) 0.78);
    static Pattern maitreBolet = new Pattern(imagePath + "maitreBolet.png").similar((float) 0.90);
    static Pattern baveBouftou = new Pattern(imagePath + "baveBouftou.png").similar((float) 0.78);
    static Pattern mapSudCheminFer = new Pattern(imagePath + "mapSudCheminFer.png").similar((float) 0.80);
    static Pattern startForetAstrub = new Pattern(imagePath + "startForetAstrub.png").similar((float) 0.80);
    static Pattern startChanvrePosX10Y5 = new Pattern(imagePath + "startChanvrePosX10Y5.png").similar((float) 0.80);
    static Pattern startChanvrePosX32Y42 = new Pattern(imagePath + "startChanvrePosX32Y42.png").similar((float) 0.80);
    static Pattern startBlePosX11Y6 = new Pattern(imagePath + "startBlePosX11Y6.png").similar((float) 0.80);
    static Pattern checkAtelierPaysanAstrub = new Pattern(imagePath + "checkAtelierPaysanAstrub.png").similar((float) 0.80);
    static Pattern checkAtelierAlchiAstrub = new Pattern(imagePath + "checkAtelierAlchiAstrub.png").similar((float) 0.80);


    static Pattern potionFoyer = new Pattern(imagePath + "potionFoyer.png").similar((float) 0.80);
    static Pattern poudrePerlenpain = new Pattern(imagePath + "poudrePerlenpain.png").similar((float) 0.80);
    static Pattern boisErable = new Pattern(imagePath + "boisErable.png").similar((float) 0.80);
    static Pattern boisNoyer = new Pattern(imagePath + "boisNoyer.png").similar((float) 0.80);
    static Pattern geleesRouge = new Pattern(imagePath + "geleesRouge.png").similar((float) 0.80);

    static Pattern osChafer = new Pattern(imagePath + "osChafer.png").similar((float) 0.80);
    static Pattern boisChataignier = new Pattern(imagePath + "boisChataignier.png").similar((float) 0.80);
    static Pattern boisChene = new Pattern(imagePath + "boisChene.png").similar((float) 0.80);
    static Pattern boisFrene = new Pattern(imagePath + "boisFrene.png").similar((float) 0.80);

    static Pattern popoBrakmar = new Pattern(imagePath + "popoBrakmar.png").similar((float) 0.80);

    static Pattern polirPierre = new Pattern(imagePath + "polirPierre.png").similar((float) 0.80);
    static Pattern pierreSaphir = new Pattern(imagePath + "pierreSaphir.png").similar((float) 0.80);
    static Pattern eau = new Pattern(imagePath + "eau.png").similar((float) 0.80);
    static Pattern pierreChristal = new Pattern(imagePath + "pierreChristal.png").similar((float) 0.80);
    static Pattern pierreEmeraude = new Pattern(imagePath + "pierreEmeraude.png").similar((float) 0.80);
    static Pattern pierreRubis = new Pattern(imagePath + "pierreRubis.png").similar((float) 0.80);
    static Pattern aluminite = new Pattern(imagePath + "aluminite.png").similar((float) 0.80);

    static Pattern silex = new Pattern(imagePath + "silex.png").similar((float) 0.80);

    static Pattern pierrePolie = new Pattern(imagePath + "pierrePolie.png").similar((float) 0.80);

    static Pattern pierreGranit = new Pattern(imagePath + "pierreGranit.png").similar((float) 0.80);

    static Pattern potionVieilesse = new Pattern(imagePath + "potionVieilesse.png").similar((float) 0.80);

    static Pattern riz = new Pattern(imagePath + "riz.png").similar((float) 0.80);
    static Pattern chanvreRecolte = new Pattern(imagePath + "chanvreRecolte.png").similar((float) 0.80);
    static Pattern bleRecolte = new Pattern(imagePath + "bleRecolte.png").similar((float) 0.75);
    static Pattern bleInventaire = new Pattern(imagePath + "bleInventaire.png").similar((float) 0.80);
    static Pattern trefle = new Pattern(imagePath + "trefle.png").similar((float) 0.80);
    static Pattern chanvre = new Pattern(imagePath + "chanvre.png").similar((float) 0.70);
    static Pattern graineChanvre = new Pattern(imagePath + "graineChanvre.png").similar((float) 0.80);
    static Pattern faucher = new Pattern(imagePath + "faucher.png").similar((float) 0.80);
    static Pattern cueillir = new Pattern(imagePath + "cueillir.png").similar((float) 0.80);
    static Pattern egreneur = new Pattern(imagePath + "egreneur.png").similar((float) 0.80);

    static Pattern epouventailFight = new Pattern(imagePath + "epouventailFight.png").similar((float) 0.80);
    static Pattern epouventail = new Pattern(imagePath + "epouventail.png").similar((float) 0.80);
    static Pattern bulbiChanvre = new Pattern(imagePath + "bulbiChanvre.png").similar((float) 0.90);
    static Pattern zaapPandalaEau = new Pattern(imagePath + "zaapPandalaEau.png").similar((float) 0.80);
    static Pattern sacDeRiz = new Pattern(imagePath + "sacDeRiz.png").similar((float) 0.80);
    static Pattern rizInventaire = new Pattern(imagePath + "rizInventaire.png").similar((float) 0.80);
    static Pattern rizInventaire2 = new Pattern(imagePath + "rizInventaire2.png").similar((float) 0.80);

    static Pattern pretCombat = new Pattern(imagePath + "pretCombat.png").similar((float) 0.80);
    static Pattern preparerPotion = new Pattern(imagePath + "preparerPotion.png").similar((float) 0.80);
    static Pattern fiolePandaburg = new Pattern(imagePath + "fiolePandaburg.png").similar((float) 0.80);

    static int yUp = 65;
    static int xLeft = 365;
    static int xRight = 1250;
    static int yDown = 580;
    public static void main(String[] args) throws IOException, InterruptedException, AWTException, FindFailed {

        General general = new General();
        //general.testCombatDefi();

        BotsCraft botsCraft = new BotsCraft();
        //botsCraft.craftTristeLame();
        //botsCraft.craftLameDuChafer();
        //botsCraft.craftHacheTerophyle();
        //botsCraft.craftBatonDaknPublic();
        //botsCraft.craftBaton110Public();
        //botsCraft.craftSylvienPublic();
        //botsCraft.craftArcEco();
        //botsCraft.craftMedailleHoly();
        //botsCraft.polirPierres("rubis"); //rubis - emeraude - saphir - cristal
        //botsCraft.ouvrirRunes();
        //botsCraft.polirPDAPetiteHazar();
        //botsCraft.potionBonta();
        //botsCraft.potionRappel();
        botsCraft.potionBrak();
        //botsCraft.potionVieillesse();
        //botsCraft.graineChanvre();

        BotsRecolte botsRecolte = new BotsRecolte();
        //botsRecolte.recolteRiz(8000);
        //botsRecolte.recolteChanvrePosX10Y5("alchi","cra", 6000);
        //botsRecolte.recolteChanvrePosX32Y42("alchi","cra", 6000);
        //botsRecolte.recolteBlePosX11Y6("cra", 2000);
        //botsRecolte.bucherForetAstrub("cra", 3000, new ArrayList<String>(Arrays.asList("noyer","chene","chataignier")));

        BotsFourbe botsFourbe = new BotsFourbe();
        //botsFourbe.cheminFer();

        BotsJugement botsJugement = new BotsJugement();
        //botsJugement.donjonMorose();

        Abraglands abraglands = new Abraglands();
        //abraglands.abraglandsSculpteurIop();
        ///abraglands.abraglandsIopBoucherAmakna();
        //abraglands.abraglandsIopAlchiAmakna();
        //abraglands.abraglandsIopScaraNord();
        //abraglands.abraglandsIopScaraNordGauche();

        BotsElevage botsElevage = new BotsElevage();
        //botsElevage.nourirCorbac();

        BotsEnu botsEnu = new BotsEnu();
        //botsEnu.abraglandsEnu();
        //botsEnu.arakne();
        //abraglandsEnu();
        //betaKamas();
        //arakne();
        //depodsGlands();
    }
}
