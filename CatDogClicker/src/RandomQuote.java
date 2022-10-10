import java.util.Random;

public class RandomQuote {
    

    public String dogSaySomething(){
        
        String[] quoteArray = {
            "»Hunde können Krankheiten wie Diabetes und Krebs riechen.«",
            "»Hunde verrichten ihr Geschäft in Nord-Süd-Richtung.«",
            "»Hunde können bis zu 10.000 Mal besser riechen als Menschen.«",
            "»Hunde wissen, wenn sie nicht über genügend Informationen verfügen, um ein Problem zu lösen und suchen aktiv nach weiteren Informationen.«",
            "»Hunde haben drei Augenlider.«",
            "»Um trinken zu können, tauchen Hunde die Zunge gerade ins Wasser, legen sie nach hinten um und schaufeln so das Wasser in den Rachen.«",
            "»Unterschiedliche Gerüche im Urin eines Hundes können anderen Hunden mitteilen, ob der Hund, der die Nachricht verlässt, weiblich oder männlich, alt oder jung, krank oder gesund, glücklich oder wütend ist.«",
            "vHunde können Farben sehen, aber ihr Farbwahrnehmung ähnelt einer Person, die eine rot-grüne Farbenblindheit hat.«",
            "vHunde können am Knurren eines anderen Hundes dessen Größe erkennen.«",
            "vAuch Hunde haben „Schweißfüße“. Die merokrinen Schweißdrüsen befinden sich in den Pfoten des Hundes. Ist es heiß, werden sie aktiv und kühlen so den Hund ab. Deshalb kann man auch manchmal feuchte Pfotenabdrücke sehen.«"
        };

        Random random = new Random();
        int randomIndex = random.nextInt(quoteArray.length);
        String randomFact = quoteArray[randomIndex];

        return randomFact;
    }

    public String catSaySomething(){
        String[] quoteArray = {
            "»Schnurrhaare der Katze sind Stimmungsbarometer. Hängen sie entspannt herunter, ist die Katze zufrieden. Sind sie gerade nach vorne gerichtet, kann es sein, dass sie wütend ist.«",
            "»Katzen lieben Katzenminze, insbesondere die echte Katzenminze (Nepeta Cataria). Sie hat eine berauschende Wirkung auf die Tiere. Verantwortlich dafür ist der Duftstoff Nepectalaton, eine flüchtige Substanz, die die Katzen in Euphorie versetzt.«",
            "»Katzen markieren ihre Halter als Besitz. In ihren Wangen, Pfoten und Flanken haben sie Duftdrüsen. Wenn sie sich damit an ihrem Menschen reiben, hinterlassen sie anderen Katzen die Botschaft, Anspruch auf ihren Halter erhoben zu haben.«",
            "»Die Katzenzunge ist mit winzigen Stacheln (Papillen) bestückt. Diese sind gekrümmt und mit u-förmigen Hohlräumen ausgerüstet. Über diese Hohlräume wird Speichel beim Lecken an das Fell und bis auf die Haut weitergeleitet, was für eine wichtige Kühlung sorgt.«",
            "»Der Nasenabdruck einer jeden Katze ist so einzigartig wie ein Fingerabdruck. Wenn es einen Scanner dafür gäbe, müsste man Katzen nicht mehr mit einem Mikrochip versehen lassen.«",
            "»Rote Katzen sind meist männlich, dreifarbige Katzen fast immer weiblich.«",
            "»Weiße Katzen mit blauen Augen neigen zur Taubheit. Ursache ist eine Anomalie in ihrem Erbgut.«",
            "»Katzen miauen in erster Linie nur bei Menschen. Die Kommunikation mit Artgenossen erfolgt über die Körpersprache.«",
            "»Katzen schlafen die meiste Zeit. Geschätzt sind es 14 – 16 Stunden pro Tag bzw. 70% ihres Lebens.«",
            "»Die älteste Katze wurde 38 Jahre alt.  Creme Puff wurde am 3. August 1967 geboren und verstarb am 6. August 2005, genau nach 38 Jahren und drei Tagen. Mit dieser Leistung schaffte es Creme Puff in das Guinness-Buch der Rekorde.«"
        };

        Random random = new Random();
        int randomIndex = random.nextInt(quoteArray.length);
        String randomFact = quoteArray[randomIndex];

        return randomFact;
    }}

        /*for(int i = 0; i < quoteArray.length; i++){
            Random random = new Random();
            int randomIndex = random.nextInt(quoteArray.length);
            if(randomIndex < quoteArray.length){
                System.out.println(quoteArray[randomIndex]);
            }
            for(int a = 0; a < randomIndex; a++ ){
               System.out.println(quoteArray[i]);
            }
            
        }*/
        
    

