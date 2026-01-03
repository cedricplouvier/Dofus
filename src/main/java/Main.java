import org.sikuli.script.*;

import java.awt.*;
import java.io.*;

public class Main {
    /* All Images have been taken in 1280x800. Make sure to use the same resolution for images to be recognized
    Some images are related to a game character and screenshots need to be renewed to function for your account
     */

    static Pattern fleurDeChanvre = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/fleurDeChanvre.png").similar((float) 0.8);
    static Pattern phenix = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/phenix.png").similar((float) 0.8);
    static Pattern abondonner = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/abondonner.png").similar((float) 0.8);
    static Pattern couper = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/couper.png").similar((float) 0.8);
    static Pattern arbreNoyer = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/arbreNoyer.png").similar((float) 0.8);
    static Pattern arbreChataignier = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/arbreChataignier.png").similar((float) 0.8);
    static Pattern arbreFrene = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/arbreFrene.png").similar((float) 0.8);
    static Pattern abraBack = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/abraBack.png").similar((float) 0.8);
    static Pattern abraLeft = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/abraLeft.png").similar((float) 0.8);
    static Pattern abraRight = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/abraRight.png").similar((float) 0.8);
    static Pattern abraFront = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/abraFront.png").similar((float) 0.8);
    static Pattern abraFight = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/abraFight.png").similar((float) 0.8);
    static Pattern fermerCombat = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/fermerCombat.png").similar((float) 0.8);
    static Pattern options = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/options.png").similar((float) 0.78);
    static Pattern tropCharge = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/tropCharge.png").similar((float) 0.80);
    static Pattern popoRappel = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/popoRappel.png").similar((float) 0.80);
    static Pattern popoBonta = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/popoBonta.png").similar((float) 0.80);
    static Pattern popoBontaInventaire = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/popoBontaInventaire.png").similar((float) 0.80);
    static Pattern popoBrak = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/popoBrak.png").similar((float) 0.80);
    static Pattern fiolePandaPils = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/fiolePandaPils.png").similar((float) 0.80);
    static Pattern entreMaison = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/entreMaison.png").similar((float) 0.80);
    static Pattern delock = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/delock.png").similar((float) 0.80);
    static Pattern ouvreCoffre = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/ouvreCoffre.png").similar((float) 0.80);
    static Pattern ressourceInventaire = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/ressourceInventaire.png").similar((float) 0.80);
    static Pattern bworky = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/bworky.png").similar((float) 0.80);
    static Pattern arrowInventaire = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/arrowInventaire.png").similar((float) 0.80);
    static Pattern familierInventaire = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/familierInventaire.png").similar((float) 0.80);
    static Pattern swordInventaire = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/swordInventaire.png").similar((float) 0.80);
    static Pattern max = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/max.png").similar((float) 0.80);
    static Pattern check = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/check.png").similar((float) 0.80);
    static Pattern close = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/close.png").similar((float) 0.80);
    static Pattern zaapChateau = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/zaapChateau.png").similar((float) 0.80);
    static Pattern zaapAstrub = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/zaapAstrub.png").similar((float) 0.80);
    static Pattern utiliser = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/utiliser.png").similar((float) 0.80);
    static Pattern selectZaapViVi = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/selectZaapViVi.png").similar((float) 0.80);
    static Pattern selectZaapMili = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/selectZaapMili.png").similar((float) 0.80);
    static Pattern milifutaie = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/milifutaie.png").similar((float) 0.80);
    static Pattern selectZaapScara = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/selectZaapScara.png").similar((float) 0.80);
    static Pattern oui = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/oui.png").similar((float) 0.80);
    static Pattern pykur = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/pykur.png").similar((float) 0.80);
    static Pattern nomoon = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/nomoon.png").similar((float) 0.80);
    static Pattern ambre = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/ambre.png").similar((float) 0.80);
    static Pattern ambreAbra = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/ambreAbra.png").similar((float) 0.80);
    static Pattern boisEnvoute = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/boisEnvoute.png").similar((float) 0.80);
    static Pattern bourgeonAbra = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/bourgeonAbra.png").similar((float) 0.80);
    static Pattern clefAbra = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/clefAbra.png").similar((float) 0.80);
    static Pattern racineAbra = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/racineAbra.png").similar((float) 0.80);
    static Pattern seveAbra = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/seveAbra.png").similar((float) 0.80);
    static Pattern abraGlands = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/abraGlands.png").similar((float) 0.80);
    static Pattern ecorceAbra = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/ecorceAbra.png").similar((float) 0.80);
    static Pattern epeeCombat = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/epeeCombat.png").similar((float) 0.80);
    static Pattern passerTour = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/passerTour.png").similar((float) 0.80);
    static Pattern ennemiCombat = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/ennemiCombat.png").similar((float) 0.90);
    static Pattern allieCombat = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/allieCombat.png").similar((float) 0.80);
    static Pattern minerai = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/minerai.png").similar((float) 0.80);
    static Pattern argent = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/argent.png").similar((float) 0.80);
    static Pattern bauxite = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/bauxite.png").similar((float) 0.80);
    static Pattern kobalte = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/kobalte.png").similar((float) 0.80);
    static Pattern bronze = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/bronze.png").similar((float) 0.80);
    static Pattern cuivre = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/cuivre.png").similar((float) 0.80);
    static Pattern etain = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/etain.png").similar((float) 0.80);
    static Pattern forgerEpee = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/forgerEpee.png").similar((float) 0.80);
    static Pattern forgerHache = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/forgerHache.png").similar((float) 0.80);
    static Pattern sculpterArc = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/sculpterArc.png").similar((float) 0.80);
    static Pattern sculpterBaton = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/sculpterBaton.png").similar((float) 0.80);
    static Pattern sculpterBaguette = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/sculpterBaguette.png").similar((float) 0.80);
    static Pattern craftAnneau = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/craftAnneau.png").similar((float) 0.80);
    static Pattern craftAmu = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/craftAmu.png").similar((float) 0.80);
    static Pattern briserObjet = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/briserObjet.png").similar((float) 0.80);
    static Pattern ficelleLin = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/ficelleLin.png").similar((float) 0.80);
    static Pattern arcEco = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/arcEco.png").similar((float) 0.80);
    static Pattern batonDakn = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/batonDakn.png").similar((float) 0.80);
    static Pattern maxCraft = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/maxCraft.png").similar((float) 0.80);

    static Pattern arakneBack = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/arakneBackInv.png").similar((float) 0.78);
    static Pattern arakneLeft = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/arakneLeftInv.png").similar((float) 0.80);
    static Pattern arakneRight = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/arakneRightInv.png").similar((float) 0.78);
    static Pattern arakneFront = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/arakneFrontInv.png").similar((float) 0.78);
    static Pattern poudre = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/poudre.png").similar((float) 0.80);
    static Pattern patteArak = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/patteArak.png").similar((float) 0.80);
    static Pattern aileMoskito = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/aileMoskito.png").similar((float) 0.80);
    static Pattern sourcilMoskito = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/sourcilMoskito.png").similar((float) 0.80);
    static Pattern epineChamp = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/epineChamp.png").similar((float) 0.80);
    static Pattern grainePavot = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/grainePavot.png").similar((float) 0.80);
    static Pattern champignon = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/champignon.png").similar((float) 0.76);
    static Pattern sadiFight = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/sadiFight.png").similar((float) 0.90);;
    static Pattern moskitoFront = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/moskitoFront.png").similar((float) 0.78);
    static Pattern moskitoLeft = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/moskitoLeft.png").similar((float) 0.78);
    static Pattern moskitoBack = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/moskitoBack.png").similar((float) 0.78);
    static Pattern moskitoRight = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/moskitoRight.png").similar((float) 0.78);
    static Pattern champChamp = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/champChamp.png").similar((float) 0.78);
    static Pattern champChamp2 = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/champChamp2.png").similar((float) 0.78);
    static Pattern champChamp3 = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/champChamp3.png").similar((float) 0.78);
    static Pattern baveBouftou = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/baveBouftou.png").similar((float) 0.78);
    static Pattern mapSudCheminFer = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/mapSudCheminFer.png").similar((float) 0.80);

    static Pattern potionFoyer = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/potionFoyer.png").similar((float) 0.80);
    static Pattern poudrePerlenpain = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/poudrePerlenpain.png").similar((float) 0.80);
    static Pattern boisErable = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/boisErable.png").similar((float) 0.80);
    static Pattern boisNoyer = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/boisNoyer.png").similar((float) 0.80);
    static Pattern geleesRouge = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/geleesRouge.png").similar((float) 0.80);

    static Pattern osChafer = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/osChafer.png").similar((float) 0.80);
    static Pattern boisChataignier = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/boisChataignier.png").similar((float) 0.80);
    static Pattern boisChene = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/boisChene.png").similar((float) 0.80);

    static Pattern popoBrakmar = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/popoBrakmar.png").similar((float) 0.80);

    static Pattern polirPierre = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/polirPierre.png").similar((float) 0.80);
    static Pattern pierreSaphir = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/pierreSaphir.png").similar((float) 0.80);
    static Pattern eau = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/eau.png").similar((float) 0.80);
    static Pattern pierreChristal = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/pierreChristal.png").similar((float) 0.80);
    static Pattern pierreEmeraude = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/pierreEmeraude.png").similar((float) 0.80);
    static Pattern pierreRubis = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/pierreRubis.png").similar((float) 0.80);
    static Pattern aluminite = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/aluminite.png").similar((float) 0.80);

    static Pattern silex = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/silex.png").similar((float) 0.80);

    static Pattern pierrePolie = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/pierrePolie.png").similar((float) 0.80);

    static Pattern pierreGranit = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/pierreGranit.png").similar((float) 0.80);

    static Pattern potionVieilesse = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/potionVieilesse.png").similar((float) 0.80);

    static Pattern riz = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/riz.png").similar((float) 0.80);
    static Pattern chanvreRecolte = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/chanvreRecolte.png").similar((float) 0.80);
    static Pattern trefle = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/trefle.png").similar((float) 0.80);
    static Pattern chanvre = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/chanvre.png").similar((float) 0.80);
    static Pattern faucher = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/faucher.png").similar((float) 0.80);

    static Pattern epouventailFight = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/epouventailFight.png").similar((float) 0.80);
    static Pattern epouventail = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/epouventail.png").similar((float) 0.80);
    static Pattern zaapPandalaEau = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/zaapPandalaEau.png").similar((float) 0.80);
    static Pattern sacDeRiz = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/sacDeRiz.png").similar((float) 0.80);
    static Pattern rizInventaire = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/rizInventaire.png").similar((float) 0.80);
    static Pattern rizInventaire2 = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/rizInventaire2.png").similar((float) 0.80);

    static Pattern pretCombat = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/pretCombat.png").similar((float) 0.80);
    static Pattern preparerPotion = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/preparerPotion.png").similar((float) 0.80);
    static Pattern fiolePandaburg = new Pattern("/Users/cedricplouvier/Documents/Dofus/SikuliEnuJava8/SikuliEnuJava8/src/main/resources/img/fiolePandaburg.png").similar((float) 0.80);

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
        //botsCraft.potionBrak();
        //botsCraft.potionVieillesse();

        BotsRecolte botsRecolte = new BotsRecolte();
        //botsRecolte.recolteRiz();
        botsRecolte.recolteChanvrePosX10Y5();
        //botsRecolte.bucherForetAstrub();

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
