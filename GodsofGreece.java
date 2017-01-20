//name: Shaziah Gafur
//date: April 7th, 2016
//purpose: Gold Master program, named Gods of Greece
//student number: 530180
/* ascii art from:
http://ascii.co.uk/art/lightning
http://www.ascii-art.de/ascii/s/swords.txt
http://www.ascii-art.de/ascii/mno/owl.txt
http://www.ascii-art.de/ascii/def/death.txt
http://www.ascii-art.de/ascii/ab/arrow.txt
http://www.clker.com/clipart-green-winged-shoe.html
http://www.ascii-art.de/ascii/s/seascape.txt
http://www.ascii-art.de/ascii/ghi/heart.txt
http://www.ascii-art.de/ascii/ab/bride+groom.txt
http://textart4u.blogspot.ca/2012/03/music-symbols-text-art-ascii-art.html  
http://rootproblem.blogspot.ca/2010/11/swirls-and-spirals-in-gimp.html
http://www.clipartpanda.com/categories/happy-and-sad-face-clip-art
http://www.chris.com/ascii/index.php?art=art%20and%20design/patterns
*/

import javax.swing.*;
public class GodsofGreece
{
    public static void main (String args[])
    {
	new GodsofGreece ();
    }


    public GodsofGreece ()
    {
	String name = JOptionPane.showInputDialog ("Enter your name:"); //dialogue button appears and allows user to enter their name
	String playAgain = "y";
	while (playAgain.equals ("Y") || playAgain.equals ("y") || playAgain.equals ("Yes") || playAgain.equals ("YES") || playAgain.equals ("yes")) //loop controls whether or not user plays again
	{
	    int points = 0;
	    System.out.println ("Gods of Greece\n\n"); //title of the game
	    story ();
	    instructions ();
	    int totalScore = Zeus (name, points) + Ares (points) + Hades (points) + Artemis (points) + Athena (points) + Hermes (points) + Poseidon (points) + Aphrodite (points) + Hera (points) + Apollo (points);
	    meetingSeth ();
	    totalScore += Seth (name, points);
	    storyEnding (totalScore, name);
	    //if user acquires certain number of points, print out a certificate
	    playAgain = IBIO.inputString ("\nDo you want to play again? (Yes/No)");

	}
	System.out.println ("Goodbye! ");
    }


    public void story ()
    {
	//story is broken down into seperate sections. Pauses in the code allow the user to read at a slow, normal pace
	delay (2000);
	System.out.println ("After several hours of playing video games after school..."); //
	delay (2500);
	System.out.println ("...your friend calls you.\n");
	delay (1500);
	System.out.println ("\t\t\"Hey, I've been having some trouble \n\t\twith this one question for our test \n\t\ttomorrow.\""); //telephone conversation between two friends
	delay (4000);
	System.out.println ("\n\t\t\t\t\t\t\t\t\t\"Dude! I totally forgot about tomorrow's\n\t\t\t\t\t\t\t\t\ttest! I didn't even start studying. \n\t\t\t\t\t\t\t\t\tI'm screwed!\"");
	delay (4000);
	System.out.println ("\n\t\t\"Well, you better start studying soon.\"");
	delay (3000);
	System.out.println ("\nSo you decide to start studying for the test and never stop until you think you are finished. It's getting late and your mom is worried about you missing \nyour bedtime. You spend hours and hours reading your school notes. Hours and hours. Hours and hours...");
	delay (10000);
	System.out.println ("\n\nWait...what's that noise?");
	delay (2000);
	System.out.println ("What is this place?!\n\n");
	delay (2000);
    }

    public void delay (int num)
    {
	try
	{
	    Thread.sleep (num);
	}
	catch (InterruptedException m)
	{
	    ;
	}
    }


    public void instructions ()
    {
	JOptionPane.showMessageDialog (null, "* * * H O W   T O   P L A Y * * * \n \n" //diaglogue bar appears, explains instructions to the user
		+ "Oh-no! You accidently travelled back in time to the Ancient Greek era.\n"
		+ "Visit each of the Greek gods and complete each activity. \n \n"
		+ "Satisfy each god/goddess by visiting each one and completing their favourite activity.\n"
		+ "There are opportunities to win points in every single activity.\n"
		+ "Collect enough points to win the game! \n \n"
		+ "Good Luck!", "Instructions", JOptionPane.QUESTION_MESSAGE);

	System.out.println ("Welcome to Ancient Greece!");
    }


    public void lightningBolt ()
    {
	System.out.println ("                  .-~*~--,.   .-.");
	System.out.println ("          .-~-. ./OOOOOOOOO\\.'OOO`9~~-.");
	System.out.println ("        .`OOOOOO.OOM.OLSONOOOOO@@OOOOOO\\ ");
	System.out.println ("       /OOOO@@@OO@@@OO@@@OOO@@@@@@@@OOOO`.");
	System.out.println ("       |OO@@@WWWW@@@@OOWWW@WWWW@@@@@@@OOOO).");
	System.out.println ("     .-'OO@@@@WW@@@W@WWWWWWWWOOWW@@@@@OOOOOO}");
	System.out.println ("    /OOO@@O@@@@W@@@@@OOWWWWWOOWOO@@@OOO@@@OO|");
	System.out.println ("   lOOO@@@OO@@@WWWWWWW\\OWWWO\\WWWOOOOOO@@@O.'");
	System.out.println ("    \\OOO@@@OOO@@@@@@OOW\\     \\WWWW@@@@@@@O'.");
	System.out.println ("     `,OO@@@OOOOOOOOOOWW\\     \\WWWW@@@@@@OOO)");
	System.out.println ("      \\,O@@@@@OOOOOOWWWWW\\     \\WW@@@@@OOOO.'");
	System.out.println ("        `~c~8~@@@@WWW@@W\\       \\WOO|\\UO-~'");
	System.out.println ("             (OWWWWWW@/\\W\\    ___\\WO)");
	System.out.println ("               `~-~''     \\   \\WW=*'");
	System.out.println ("                         __\\   \\ ");
	System.out.println ("                         \\      \\ ");
	System.out.println ("                          \\    __\\ ");
	System.out.println ("                           \\  \\");
	System.out.println ("                            \\ \\ ");
	System.out.println ("                             \\ \\ ");
	System.out.println ("                              \\\\");
	System.out.println ("                               \\\\ ");
	System.out.println ("                                \\ ");
	System.out.println ("                                 \\ ");
    }


    public int Zeus (String name, int points)
    {
	System.out.println ("<<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>>\n");
	lightningBolt ();
	String colour;
	String hint;
	System.out.println ("\n\"So " + name + ", you think you can defeat the one and only ruler of Mount Olympus? I am the King of the Gods! I bet you can't even guess what my name is.\"\n"); //guesses Zeus's name
	String guess = IBIO.inputString ("Your guess: ");
	if (guess.equals ("Zeus") || guess.equals ("ZEUS") || guess.equals ("zeus")) //user's input may be in 3 different forms
	{
	    points++; //points increment by one
	    System.out.print ("\"You are very clever. You received one point.\"\n");
	}
	else
	{
	    System.out.print ("\"How disrespectful! I am your lord, Zeus!\"\n "); //no points collected
	}
	System.out.println ("\n\"Let's play a guessing game.\"\n");
	int num = (int) (Math.random () * 5) + 1; //computer chooses a random colour, 5 possibilities
	if (num == 1)
	{
	    colour = "Yellow";
	    hint = "It is one of the colours of the rainbow.";
	}
	else if (num == 2)
	{
	    colour = "Peach";
	    hint = "It is also the name of a fruit. The answer is not orange.";
	}
	else if (num == 3)
	{
	    colour = "Green";
	    hint = "Chlorophyll makes plants look like what colour?";
	}
	else if (num == 4)
	{
	    colour = "Red";
	    hint = "What is the colour of the nose of Santa's reindeer, Rudolph?";
	}
	else
	{
	    colour = "Blue";
	    hint = "What is the colour of Neptune?";
	}
	guess = " ";
	int tries = 1;
	System.out.println ("\"What is my favourite colour? Here's a hint. " + hint+"\""); //computer gives a hint to the user

	while (!guess.equals (colour.toUpperCase ()) && !guess.equals (colour.toLowerCase ()) && !guess.equals (colour) && tries < 4) //user's input may be in three different forms
	{
	    guess = IBIO.inputString ("Attempt #" + tries + ": "); //user gets 3 chances
	    tries++;
	}

	if (guess.equals (colour.toUpperCase ()) || guess.equals (colour.toLowerCase ()) || guess.equals (colour))
	{
	    System.out.print ("\nYou've guessed correctly! You received 2 points.");
	    points += 2;
	}
	else
	    System.out.print ("\n\"You lose! The answer was " + colour.toLowerCase () + ".");
	System.out.println (" Let's play another guessing game!");
	System.out.print ("\nI'm thinking of a number between 1 and 100. Guess what it is in the least number of tries.\n");
	int randomNum = (int) (Math.random () * 100) + 1; //random number between 1 and 100
	int estimate = IBIO.inputInt ("Guess: ");
	tries = 1;
	while (isvalidInteger (estimate)) //checks to see if the user input is valid
	{
	    estimate = IBIO.inputInt ("That input is invalid. Choose a number between 1 and 100. ");
	}
	while (randomNum != estimate)
	{
	    if (randomNum > estimate)
	    {
		estimate = IBIO.inputInt ("Guess a larger number: ");
		tries++;
	    }
	    else
	    {
		estimate = IBIO.inputInt ("Guess a smaller number: ");
		tries++;
	    }
	} //user has infinite number of tries
	System.out.println ("\nNice job! You've found my number. It took you " + tries + " tries to guess it.");
	if (tries == 7) //if user required less than 8 tries, they receive points. Otherwise, no points are collected
	    points += 2;
	else if (tries == 6)
	    points += 5;
	else if (tries == 5)
	    points += 8;
	else if (tries == 4)
	    points += 11;
	else if (tries == 3)
	    points += 14;
	else if (tries == 2)
	    points += 17;
	else if (tries == 1)
	    points += 20;
	System.out.println ("You received " + points + " points.\n\nI must thank you for spending some time playing games with me. As reward for making lord Zeus happy, I will tell you a way to return home. Collect the sacred\nartifacts, bring them to a portal, and read this spell.\" *Zeus hands you a scroll* \"Life will continue as if no time has elapsed and everything will turn\nback to normal. Farewell mortal!\"\n\n\n");
	char enter = IBIO.inputChar ("Press Enter to advance... "); //user continues when he/she is ready
	return points;
    }


    public boolean isvalidInteger (int guess)
    {
	if (guess > 100 || guess < 1) //user input must be input 1 and 100
	    return true;
	else
	    return false;
    }

    public void Sword ()
    {
	System.out.println ("                          ___");
	System.out.println ("                          ( ((");
	System.out.println ("                           ) ))");
	System.out.println ("  .::.                    / /(");
	System.out.println (" 'M .-;-.-.-.-.-.-.-.-.-/| ((::::::::::::::::::::::::::::::::::::::::::::::.._");
	System.out.println ("(J ( ( ( ( ( ( ( ( ( ( ( |  ))   -====================================-      _.>");
	System.out.println (" `P `-;-`-`-`-`-`-`-`-`-\\| ((::::::::::::::::::::::::::::::::::::::::::::::''");
	System.out.println ("  `::'                    \\ \\(");
	System.out.println ("                           ) ))");
	System.out.println ("                          (_((");
    }
    
    public int Ares (int points)
    {
	String playAgain = "y";
	String winner;
	int aresScore;
	int uScore;
	String user;
	System.out.println ("<<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>>\n");
	Sword();
	System.out.println (" \"Fee fie fo fum ");//Ares chants a poem
	delay (2000);
	System.out.println ("\n A juvenile mortal to fight me has come.");
	delay (2000);
	System.out.println ("\n He shall surrender and the crowd shall roar.");
	delay (2000);
	System.out.println ("\n For I am Ares, the God of War!\"");
	delay (2000);
	System.out.println ("\n\n\"I challenge you to a duel.\"");
	System.out.println ("\n\nTask: Defeat Ares by competing in a variation of Rock Paper Scissors\n\tMedusa defeats Hydra\n\tHydra defeats Polyphemus(uses breath to poison)\n\tPolyphemus defeats Medusa");
	System.out.println ("\nDescription of creatures:\n Medusa is a mortal monster who has snakes as hair. Anyone who looks into her eyes immediately turns into stone.\n Hydra is a serpent who possesses several heads. When one head is chopped off, two more grow back.\n Polyphemus is a cyclopes, which have only one eye. Polyphemus's eye was blinded by Odysseus, so he is unaffected by Medusa.\n");
	System.out.println ("Here are your choices: Medusa, Hydra, or Polyphemus.");
	System.out.println ("\t\tYour Choice:\t\tAres's Choice:\t\tWho won:");
	while (playAgain.equals ("y")) 
	{
	    aresScore = 0;
	    uScore = 0;
	    for (int i = 1 ; i < 6 ; i++)
	    {
		System.out.println ();
		user = userChoice ();
		String ares = aresChoice ();
		char win = winner (user, ares);
		if (win == 'a')
		{
		    aresScore++;
		    winner = "Ares Won!";
		}
		else if (win == 'u')
		{
		    uScore++;
		    winner = "You Won!";
		}
		else
		{
		    winner = "It's a tie";
		}
		System.out.print ("Round " + i + ":\t" + user);
		if (user.equals ("Polyphemus"))
		    System.out.print ("\t\t" + ares);
		else
		    System.out.print ("\t\t\t" + ares);
		if (ares.equals ("Polyphemus"))
		    System.out.println ("\t\t" + winner);
		else
		    System.out.println ("\t\t\t" + winner);
	    }
	    if (aresScore == uScore)
	    {
		System.out.println ("Neither one of you won. Let's play again!");
		playAgain = "y";
	    }
	    else if (aresScore > uScore)
	    {
		playAgain = "n";
		System.out.println ("Ares defeated you!");
		playAgain = IBIO.inputString ("Try again? ");  //if user loses against Ares, user can play again
		if (playAgain.equals ("y") || playAgain.equals ("Y") || playAgain.equals ("Yes") || playAgain.equals ("YES") || playAgain.equals ("yes"))
		    playAgain = "y"; //this means that the user gave up trying to defeat Ares. As a result, the user will receive no points
	    }
	    else
	    {
		System.out.println ("You defeated Ares!");
		playAgain = "w";
	    }
	}
	if (playAgain == "w")
	{
	    System.out.println ("You've received 10 points!");
	    points = 0;
	}
	else
	{
	    System.out.println ("You received no points because you gave up on defeating Ares.\n\n\t\"Never give up on what you really want to do. The person with big dreams is more powerful than one with all the facts.\" --A L B E R T   E I N S T E I N");
	    points += 10;
	}
	System.out.println ("\n\"You are a very brave mortal for fighting against me. I must reward you with something. Here, take my shield.\" *Ares hands you his shield* \"I hope we meet again.\"\n\n");
	char enter = IBIO.inputChar ("Press Enter to advance... ");
	return points;
    }


    public String aresChoice ()
    {
	int choice = (int) (Math.random () * 3) + 1;
	if (choice == 1)
	    return "Hydra";
	else if (choice == 2)
	    return "Medusa";
	else
	    return "Polyphemus";
    }


    public String userChoice ()
    {
	String choice = IBIO.inputString ("Enter your choice: ");
	while (!choiceisValid (choice))
	{
	    choice = IBIO.inputString ("That input is invalid. Enter either Medusa, Hydra or Polyphemus. ");
	}
	if (choice.equals ("Hydra") || choice.equals ("hydra") || choice.equals ("HYDRA") | choice.equals ("H") || choice.equals ("h"))
	    return "Hydra";
	else if (choice.equals ("Medusa") || choice.equals ("MEDUSA") || choice.equals ("medusa") || choice.equals ("m") || choice.equals ("M"))
	    return "Medusa";
	else
	    return "Polyphemus";
    }


    public boolean choiceisValid (String choice)
    {
	if (choice.equals ("Hydra") || choice.equals ("hydra") || choice.equals ("HYDRA") || choice.equals ("Medusa") || choice.equals ("MEDUSA") || choice.equals ("medusa") || choice.equals ("Polyphemus") || choice.equals ("POLYPHEMUS") || choice.equals ("polyphemus") || choice.equals ("m") || choice.equals ("M") || choice.equals ("p") || choice.equals ("P") || choice.equals ("h") || choice.equals ("H"))
	    return true;
	else
	    return false; //ensures that user enters a valid input
    }


    public char winner (String user, String ares) //checks to see who won
    {
	if (user == ares) 
	    return 't';
	else if (ares.equals ("Hydra"))
	{
	    if (user.equals ("Medusa"))
		return 'u';
	    else
		return 'a';
	}
	else if (ares.equals ("Medusa"))
	{
	    if (user.equals ("Polyphemus"))
		return 'u';
	    else
		return 'a';
	}
	else
	{
	    if (user.equals ("Hydra"))
		return 'u';
	    else
		return 'a';
	}
    }

    public void Owl ()
    {   
	System.out.println ("                             ____");
	System.out.println ("                          ,''    ''.");
	System.out.println ("                         / `-.  .-' \\");
	System.out.println ("                        /( (O))((O) )");
	System.out.println ("                       /'-..-'/\\`-..|");
	System.out.println ("                     ,'\\   `-.\\/.--'|");
	System.out.println ("                   ,' ( \\           |");
	System.out.println ("                 ,'( (   `._        |");
	System.out.println ("                /( (  ( ( | `-._ _,-;");
	System.out.println ("               /( (  ( ( (|     '  ;");
	System.out.println ("              / ((  (    /        /");
	System.out.println ("             //         /        /");
	System.out.println ("             //  / /  ,'        /");
	System.out.println ("            // /    ,'         /");
	System.out.println ("            //  / ,'          ;");
	System.out.println ("            //_,-'          ;");
	System.out.println ("            // /,,,,..-))-))\\    /|");
	System.out.println ("              /; ; ;\\ `.  \\  \\  / |");
	System.out.println ("             /; ; ; ;\\  \\.  . \\/./");
	System.out.println ("            (; ; ;_,_,\\  .: \\   /");
	System.out.println ("             `-'-'     | : . |:|");
	System.out.println ("                       |. | : .|");
    }

    public int Athena (int points)
    {
	String answer;
	int question;
	char uAnswer;
	String input;
	System.out.println ("<<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>>\n");
	Owl();
	System.out.println ("Hi! I'm Athena, the goddess of wisdom. I am a great warrior. Rather than using strength to defeat the enemy, I use intelligence to outsmart them.\nThe Greek city, Athens, was named after me. My main symbols are owls and olive trees.\n Let's do some brainteasers!");
	input = IBIO.inputString ("\nMary's dad had 4 kids: Bob, Joe, and Peter. Who was the fourth kid? ");
	answer = "Mary";
	question = 3;
	uAnswer = convertBrainteaser (question, input, answer);
	points += checkBrainteaser (uAnswer, input, answer, question);
	input = IBIO.inputString ("\nThere is an ancient invention still used today that allows people to see through walls. What is it? ");
	answer = "A window";
	question = 1;
	uAnswer = convertBrainteaser (question, input, answer);
	points += checkBrainteaser (uAnswer, input, answer, question);
	question = 2;
	answer = "Three";
	input = IBIO.inputString ("\nWhat is the smallest number of fish that can swim in this formation: 2 fish in front of a fish, 2 fish behind a fish, and a fish between 2 fish? ");
	uAnswer = convertBrainteaser (question, input, answer);
	points += checkBrainteaser (uAnswer, input, answer, question);
	System.out.println ("\nIf Frank and Sam total their ages, the answer is 49. Frank is twice as old as Sam was when Frank was as old as Sam now. How old are Frank and Sam?");
	int Frank = IBIO.inputInt ("Frank's age: ");
	int Sam = IBIO.inputInt ("Sam's age: ");
	answer = "Nope. Frank is 28 and Sam is 21.";
	if (Frank == 28 && Sam == 21)
	{
	    System.out.println ("Good job!");
	    points += 10;
	}
	else
	    System.out.println ("Nope. Frank is 28 and Sam is 21.");

	System.out.println ("\"That was a lot of fun. I want you to have this owl pendant. There's one important thing you have to remember. My father, Zeus, is not a\nan of mortals and cannot be trusted. I hope you enjoy the rest of your journey!\"");
	char enter = IBIO.inputChar ("Press Enter to advance... ");
	return points;
    }

    public int checkBrainteaser (char uAnswer, String input, String answer, int question)
    {
	int points = 0;
	int tries = 1;
	while (uAnswer == 'n' && tries < 3)
	{

	    input = IBIO.inputString ("\n\"Sorry. That's not the right answer. Try again.\"");
	    uAnswer = convertBrainteaser (question, input, answer);
	    tries++;
	}
	if (uAnswer == 'n')
	    System.out.print ("\"The correct answer was: " + answer + "\"\n");
	else
	{
	    System.out.print ("\"That's correct!\"\n");
	    points += 10;
	}
	return points;

    }


    public char convertBrainteaser (int question, String input, String answer) //different forms of the answer is acceptable
    {
	if (question == 1 && input.equals (answer) || input.equals (answer.toLowerCase ()) || input.equals (answer.toUpperCase ()) || input.equals ("window") || input.equals ("Window") || input.equals ("WINDOW") || input.equals ("windows") || input.equals ("Windows") || input.equals ("WINDOWS"))
	    return 'y';

	else if (question == 2 && input.equals (answer) || input.equals (answer.toLowerCase ()) || input.equals (answer.toUpperCase ()) || input.equals ("3"))
	    return 'y';

	else if (question == 3 && input.equals ("Mary") || input.equals ("MARY") || input.equals ("mary")) 
	    return 'y';
	else
	    return 'n';
    }
    
    public void Death ()
    {
	System.out.println ("               ...");
	System.out.println ("             ;::::;");
	System.out.println ("           ;::::; :;");
	System.out.println ("         ;:::::'   :;");
	System.out.println ("        ;:::::;     ;.");
	System.out.println ("       ,:::::'       ;           OOO\\");
	System.out.println ("       ::::::;       ;          OOOOO\\");
	System.out.println ("       ;:::::;       ;         OOOOOOOO");
	System.out.println ("      ,;::::::;     ;'         / OOOOOOO");
	System.out.println ("    ;:::::::::`. ,,,;.        /  / DOOOOOO");
	System.out.println ("  .';:::::::::::::::::;,     /  /     DOOOO");
	System.out.println (" ,::::::;::::::;;;;::::;,   /  /        DOOO");
	System.out.println (";`::::::`'::::::;;;::::: ,#/  /          DOOO");
	System.out.println (":`:::::::`;::::::;;::: ;::#  /            DOOO");
	System.out.println ("::`:::::::`;:::::::: ;::::# /              DOO");
	System.out.println ("`:`:::::::`;:::::: ;::::::#/               DOO");
	System.out.println (" :::`:::::::`;; ;:::::::::##                OO");
	System.out.println (" ::::`:::::::`;::::::::;:::#                OO");
	System.out.println (" `:::::`::::::::::::;'`:;::#                O");
	System.out.println ("  `:::::`::::::::;' /  / `:#");
	System.out.println ("   ::::::`:::::;'  /  /   `#");
    }     

    public int Hades (int points)
    {
	System.out.println ("<<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>>\n");
	Death ();
	String answerA;
	String answerB;
	String answerC;
	String answerD;
	String answerE;
	boolean answer;
	char multiAnswer;
	System.out.println ("\n\n\"Hey there! I'm Hades, the god of the Dead. I also rule the Underworld, the world of the dead. I am married to Persephone, the queen of the dead.\n");
	System.out.println ("We're going to play some trivia!\n");
	System.out.println ("Here's the first question: ");
	String question = IBIO.inputString ("Who is the best Ancient Greek god/goddess of all time? ");
	if (question.equals ("Hades") || question.equals ("hades") || question.equals ("HADES"))
	{
	    System.out.println ("Very good! You are my favourite mortal! ");
	    points += 3;
	}
	else
	    System.out.println ("\nHuh?! NO, IT'S ME!!!! HADES!");
	int num = (int) (Math.random () * 3) + 1; //computer chooses random true or false questions, 3 possibilities
	System.out.println ("\n\nT R U E   OR   F A L S E");
	if (num == 1) 
	{
	    question = "Poseidon's main weapon is a spear";
	    answer = false;
	}
	else if (num == 2)
	{
	    question = "Hephaestus is married to the goddess of love & beauty.";
	    answer = true;
	}
	else
	{
	    question = "The Olympics were first held during Ancient Greece.";
	    answer = true;
	}
	boolean response = TorF (question);
	points += triviaPoints (answer, response); //points are collected
	num = (int) (Math.random () * 3) + 1;//computer chooses random true or false questions, 3 possibilities
	if (num == 1)
	{
	    question = "Meat was a substantial part of the Greeks' diet. ";
	    answer = false;
	}
	else if (num == 2)
	{
	    question = "If a boy grew up in Sparta, he would be trained to serve for the military.";
	    answer = true;
	}
	else
	{
	    question = "Greek girls were given the same education as Greek boys.";
	    answer = false;
	}
	response = TorF (question);
	points += triviaPoints (answer, response);//points are collected
	num = (int) (Math.random () * 3) + 1; //computer chooses random true or false questions, 3 possibilities
	if (num == 1)
	{
	    question = "The primary focus of the culture of the city of Athens was Art and Education.";
	    answer = true;
	}
	else if (num == 2)
	{
	    question = "The yo-yo was invented by the Ancient Greeks.";
	    answer = true;
	}
	else
	{
	    question = "Slavery was not very common in Ancient Greece.";
	    answer = false;
	}
	response = TorF (question);
	points += triviaPoints (answer, response); //points are collected
	System.out.println ("\n\"It was nice meeting you! Take my cornucopia as a gift.\"");
	char enter = IBIO.inputChar ("Press Enter to advance... ");
	return points;
    }


    public int triviaPoints (boolean answer, boolean response) //checks to see if user's input is correct, points are collected
    {
	int points = 0;
	if (response == answer)
	{
	    System.out.println ("Nice job!");
	    points += 3;
	}
	else
	    System.out.println ("That's incorrect");
	return points;

    }


    public boolean isValidAorB (char input)
    {
	if (input == 'A' || input == 'a' || input == 'B' || input == 'b')
	    return true;
	else
	    return false;
    }


    public boolean TorF (String question)
    {
	String uAnswer = IBIO.inputString ("\nTrue or False? \n" + question + " \n");
	while (!TrueFalseValid (uAnswer))
	{
	    uAnswer = IBIO.inputString ("That input is invalid. Choose either True or False.");
	}
	if (uAnswer.equals ("True") || uAnswer.equals ("T") || uAnswer.equals ("t") || uAnswer.equals ("TRUE") || uAnswer.equals ("true"))
	    return true;
	else
	    return false;
    }


    public boolean TrueFalseValid (String uAnswer)
    {
	if (uAnswer.equals ("True") || uAnswer.equals ("TRUE") || uAnswer.equals ("true") || uAnswer.equals ("t") || uAnswer.equals ("T") || uAnswer.equals ("False") || uAnswer.equals ("FALSE") || uAnswer.equals ("false") || uAnswer.equals ("f") || uAnswer.equals ("F"))
	    return true;
	else
	    return false;
    }


    public int Artemis (int points)
    {
	System.out.println ("<<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>>\n");
	System.out.println ("     _.-\"/______________________/////");
	System.out.println ("     `'-.\\~~~~~~~~~~~~~~~~~~~~~~\\\\\\\\\\");
	System.out.println ("\"Hello, I'm Artemis, the goddess of hunting, forests, the moon, and archery. Apollo is my twin brother. I like taking care of animals and protecting wildlife.\n\n");
	int num1;
	int num2;
	System.out.println ("Ancient Greeks loved mathematics! Why don't we do some math problems?\"");
	System.out.println ("Choose a level:\n\tEasy\n\tMedium\n\tHard");
	String choice = IBIO.inputString ("\t>> "); //user is allowed to choose their level of difficulty
	char level = chooseLevel (choice);
	if (level == 'e') //computer chooses a series of random numbers and completes addition, substraction, and multiplication
	{
	    num1 = num1to99 ();
	    num2 = num1to99 ();
	    points = Adding (num1, num2, points);
	    num1 = num1to99 ();
	    num2 = num1to99 ();
	    points = Adding (num1, num2, points);
	    num1 = num1to99 ();
	    num2 = num1to99 ();
	    points = Adding (num1, num2, points);
	    num1 = num1to99 ();
	    num2 = num1to99 ();
	    points = Subtracting (num1, num2, points);
	    num1 = num1to99 ();
	    num2 = num1to99 ();
	    points = Subtracting (num1, num2, points);
	    num1 = num1to99 ();
	    num2 = num1to99 ();
	    points = Subtracting (num1, num2, points);            
	    num1 = num1to10 ();
	    num2 = num1to10 ();
	    points = Multiplication (num1, num2, points);
	    num1 = num1to10 ();
	    num2 = num1to10 ();
	    points = Multiplication (num1, num2, points);
	}
	else if (level == 'm') //computer chooses a series of random numbers and completes addition, substraction, and multiplication
	{
	    num1 = num100to1000();
	    num2 = num100to1000 ();
	    points = Adding (num1, num2, points);
	    num1 = num100to1000 ();
	    num2 = num100to1000 ();
	    points = Adding (num1, num2, points);
	    num1 = num100to1000 ();
	    num2 = num100to1000 ();
	    points = Adding (num1, num2, points);
	    num1 = num100to1000 ();
	    num2 = num100to1000 ();
	    points = Subtracting (num1, num2, points);
	    num1 = num100to1000 ();
	    num2 = num100to1000 ();
	    points = Subtracting (num1, num2, points);
	    num1 = num100to1000 ();
	    num2 = num100to1000 ();
	    points = Subtracting (num1, num2, points); 
	    num1 = num1to99 ();
	    num2 = num1to99 ();
	    points = Multiplication (num1, num2, points);
	    num1 = num1to99 ();
	    num2 = num1to99 ();
	    points = Multiplication (num1, num2, points);
	    num1 = num1to99 ();
	    num2 = num1to99 ();
	    points = Multiplication (num1, num2, points);
	    num1 = num1to99 ();
	    num2 = num1to99 ();
	    points = Multiplication (num1, num2, points);
	}
	else //computer chooses a series of random numbers and completes questions involving exponents, multiplication, and remainders
	{
	    num1 = num1to10 ();
	    num2 = num1to10 ();
	    points = Powers (num1, num2, points);
	    num1 = num1to10 ();
	    num2 = num1to10 ();
	    points = Powers (num1, num2, points);
	    num1 = num1to10 ();
	    num2 = num1to10 ();
	    points = Powers (num1, num2, points);
	    num1 = num100to1000 ();
	    num2 = num100to1000 ();
	    points = Multiplication (num1, num2, points);
	    num1 = num100to1000 ();
	    num2 = num100to1000 ();
	    points = Multiplication (num1, num2, points);
	    num1 = num100to1000 ();
	    num2 = num100to1000 ();
	    points = Multiplication (num1, num2, points);
	    num1 = num100to1000 ();
	    num2 = num100to1000 ();
	    points = Multiplication (num1, num2, points);
	    num1 = num1to10 ();
	    num2 = num1to10 ();
	    points = Remainder (num1, num2, points);
	    num1 = num1to10 ();
	    num2 = num1to10 ();
	    points = Remainder (num1, num2, points);
	    num1 = num1to10 ();
	    num2 = num1to10 ();
	    points = Remainder (num1, num2, points);
	}
	System.out.println ("\nYou received "+points+" points.\n");
	System.out.println ("\n\"Thanks for doing some math questions with me. As a gift, you can have my golden arrow.\"");
	char enter = IBIO.inputChar ("\nPress Enter to advance... ");
	return points;
    }


    public int Remainder (int num1, int num2, int points)
    {
	int answer = IBIO.inputInt ("\n\"What is the remainder of " + num1 + "/" + num2 + "?\" ");
	if (answer == num1 % num2)
	{
	    System.out.println ("Nice!");
	    points++;
	}
	else
	    System.out.println ("\nThat's incorrect. The correct answer is " + num1 % num2 + ".");
	
	return points;
    }

    public int Powers (int num1, int num2, int points)
    {
	int answer = IBIO.inputInt ("\n\"What is " + num1 + " ^ " + num2 + "?\" ");
	if (answer == Math.pow (num1, num2))
	{
	    System.out.println ("\nGood Job!");
	    points++;
	}
	else
	    System.out.println ("\nThat's incorrect. The correct answer is " + Math.pow (num1, num2) + ".");
	return points;
    }


    public int Multiplication (int num1, int num2, int points)
    {
	int answer = IBIO.inputInt ("\n\"What's " + num1 + " X " + num2 + "? \"");
	if (answer == num1 * num2)
	{
	    System.out.println ("\nWay to go!");
	    points++;
	}
	else
	    System.out.println ("\nThat's incorrect. The correct answer is " + (num1 * num2) + ".");
	return points;
    }


    public int Adding (int num1, int num2, int points)
    {
	int answer = IBIO.inputInt ("\n\"What's " + num1 + " + " + num2 + "? \"");
	if (answer == num1 + num2)
	{
	    System.out.println ("\nCorrect!");
	    points++;
	}
	else
	    System.out.println ("\nThat's incorrect. The correct answer is " + (num1 + num2) + ".");
	return points;
    }
    
     public int Subtracting (int num1, int num2, int points)
    {
	int answer = IBIO.inputInt ("\n\"What's " + num1 + " - " + num2 + "? \"");
	if (answer == num1 - num2)
	{
	    System.out.println ("\nThat's right!");
	    points++;
	}
	else
	    System.out.println ("\nThat's incorrect. The correct answer is " + (num1 - num2) + ".");
	return points;
    }


    public int num100to1000 ()
    {
	int num = (int) (Math.random () * 901) + 100;
	return num;

    }


    public int num1to10 ()
    {
	int num = (int) (Math.random () * 9) + 1;
	return num;
    }


    public int num1to99 ()
    {
	int num = (int) (Math.random () * 99) + 1;
	return num;
    }


    public char chooseLevel (String choice)
    {
	while (!islevelValid (choice))
	{
	    choice = IBIO.inputString ("That input is invalid. Choose either easy, medium, or hard.");
	}
	if (choice.equals ("EASY") || choice.equals ("Easy") || choice.equals ("easy") || choice.equals ("e") || choice.equals ("E"))
	    return 'e';
	else if (choice.equals ("Medium") || choice.equals ("medium") || choice.equals ("MEDIUM") || choice.equals ("m") || choice.equals ("M"))
	    return 'm';
	else
	    return 'h';
    }


    public boolean islevelValid (String choice)
    {
	if (choice.equals ("EASY") || choice.equals ("Easy") || choice.equals ("easy") || choice.equals ("Medium") || choice.equals ("medium") || choice.equals ("MEDIUM") || choice.equals ("HARD") || choice.equals ("Hard") || choice.equals ("hard") || choice.equals ("M") || choice.equals ("m") || choice.equals ("E") || choice.equals ("e") || choice.equals ("H") || choice.equals ("h"))
	    return true;
	else
	    return false;
    }


    public int Hermes (int points)
    {
	int num1;
	int num;
	int score = 0;
	System.out.println ("<<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>>\n");
	System.out.println ("                              MNM7. ....,NMMM");
	System.out.println ("                            MMO.....NNNNNNO....+N");
	System.out.println ("                            MM...NN.~..M.,NNNNNM...NNI");
	System.out.println ("                             MM...N.N M,.$O..:MNN=.....DMN=");
	System.out.println ("                              MM.. N.MN8MMMN..+D..  DN=.....DNNNZ");
	System.out.println ("                               NO..N..DN.DN.$M...NN?..ON..........   M");
	System.out.println ("                               MN.NN D.M:.MM..MN,..$N. .=NNNMMZ....MM.   ");
	System.out.println ("                               MDI7 . MMN .MM..ZNNMZ78N.....NN  =$?.        ");
	System.out.println ("                            8MM...... NN,NN.MN?..MNN..NNNN ... ,NNN7           ");
	System.out.println ("                          MM........NNN. N..NN.NN 7MNM.. NZDN$...... ?NNN8.    ");
	System.out.println ("                 MMMM    DM .......INM~N M8.:N?.MND ?MNN.. +M=.8N8 ......  ?MN ");
	System.out.println ("                MN.MM$MNN$M........MM:~~MMM .NM,.MDN. NM+N?.. NN   ... . .IMN  ");
	System.out.println ("           NMMMM8M $MOMIZZDMMMMMMMNN~~~~~~~NM.NN,.D?M ..MM MN ...MN     ..     ");
	System.out.println ("           NNMMMMM MZZZO8M::~MMMMZO:~~~~~~ZNNNN+DZ.O:?D.. MN NNO... NN8.       ");
	System.out.println ("            NNM.MMMMMMMN~~~MMMMMZZD~~~~MN ..NN   .M=O .N ...M.  MNMNNNNNN      ");
	System.out.println ("            .NN~~8=~MDM~MMMMMMMZZZNIM8 ....MN.     .NN               ");
	System.out.println ("            .NNNNNNNZMMMMMMMMMZZOMN .  MMMMM                              ");
	System.out.println ("            NNNNZ8NZMMMMMMMM8ZMM...8MMMMMM                              ");
	System.out.println ("           NNNNDDDOMMMMMMMM8M,..+MMMMN                                         ");
	System.out.println ("          NNNNOZZZMMMMMMMMM ..MMM");
	System.out.println ("         NDNNNDDOMMMMMMM?..8MMM");
	System.out.println ("        NNNNNNO7MMMMMM ..NN7");
	System.out.println ("       NNNN8OZMMMMM . NM8");
	System.out.println ("    ,NZ:~~~~~+M$...NNN");
	System.out.println ("   MZ~~~~~MM....NNN");
	System.out.println (".NN~~NNN...  MN DNN");
	System.out.println (".INN.....MNMN");
	System.out.println ("...INNNN.");
	char key;
	System.out.println ("\"I'm Hermes, the messenger of the gods. I wear shoes with wings so that I can fly and transmit messages easily.\n\n");
	System.out.println ("\"It's time for a typing challenge!\nType the letter/number and press enter.\"\n");
	for (int i = 1 ; i <= 20 ; i++) //user has to type 20 different letters/numbers, user can win a maximum of 20 points
	{
	    num = (int) (Math.random () * 3) + 1; // There is a 1/3 chance of getting a number, a 1/3 chance of getting a lowercase letter, and a 1/3 chance of getting an uppercase letter
	    if (num == 1)
	    {
		num1 = (int) (Math.random () * 10);
		key = (char) (num1 + '0'); //converts integer to char, user gets a number instead of a letter
	    }
	    else
	    {
		key = lettersofAlphabet (); //user types a letter instead of a number
		if (num == 2)
		{
		    key = Character.toUpperCase (key); //converts lowercase to uppercase
		}
	    }
	    char input = IBIO.inputChar ("Enter " + key + ": ");
	    if (input == key)
		score++;  //user gets a point if they type correctly
	    System.out.println ();
	}
	System.out.println ("Your score is " + score + "/20");
	System.out.println ("Enjoy the rest of your journey! Here, take my magic wand as a gift for spending time with me.\"");
	char enter = IBIO.inputChar ("Press Enter to advance... ");
	return points + score;
    }


    public char lettersofAlphabet ()
    {
	int num = (int) (Math.random () * 26) + 1; //picks a random letter of the alphabet
	if (num == 1)
	    return 'a';
	else if (num == 2)
	    return 'b';
	else if (num == 3)
	    return 'c';
	else if (num == 4)
	    return 'd';
	else if (num == 5)
	    return 'e';
	else if (num == 6)
	    return 'f';
	else if (num == 7)
	    return 'g';
	else if (num == 8)
	    return 'h';
	else if (num == 9)
	    return 'i';
	else if (num == 10)
	    return 'j';
	else if (num == 11)
	    return 'k';
	else if (num == 12)
	    return 'l';
	else if (num == 13)
	    return 'm';
	else if (num == 14)
	    return 'n';
	else if (num == 15)
	    return 'o';
	else if (num == 16)
	    return 'p';
	else if (num == 17)
	    return 'q';
	else if (num == 18)
	    return 'r';
	else if (num == 19)
	    return 's';
	else if (num == 20)
	    return 't';
	else if (num == 21)
	    return 'u';
	else if (num == 22)
	    return 'v';
	else if (num == 23)
	    return 'w';
	else if (num == 24)
	    return 'x';
	else if (num == 25)
	    return 'y';
	else
	    return 'z';
    }


    public int Poseidon (int points)
    {
	String question;
	System.out.println ("<<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>>\n");
	System.out.println ("                  |~");
	System.out.println ("                 /|\\");
	System.out.println ("        ^^      / | \\");
	System.out.println ("           ^^  /  |  \\");
	System.out.println ("              /   |   \\");
	System.out.println ("     ^^      /    |    \\");
	System.out.println ("            /     |     \\");
	System.out.println ("           /      |      \\");
	System.out.println ("          /       |       \\");
	System.out.println ("         /        |        \\");
	System.out.println ("        /         |         \\");
	System.out.println ("       /          |__________\\   8|-                   .-''''\"\"\"\"-.");
	System.out.println ("      /        ___|______     o   |         __       .'         @  `.");
	System.out.println ("     /_______o/__________|___/|___|         \\ `.   .'  .....      ___;");
	System.out.println ("     \\    oo    ooo oo oo         \\          \\  `''   ;              :");
	System.out.println ("   _5\"\"-._5\"\"-._5\"\"-._5\"\"-._5\"\"-._5\"\"-._5\"\"-./   ..    `---'       .' _ \"\"-.");
	System.out.println ("                                            /__.'  `-............-'");
	System.out.println ("          ,oo^-'/                       ,,                ");
	System.out.println ("  \\`--oo. )_,_-.\\~                    :-o)    ");
	System.out.println ("  /,-.__=     |        ,                )/");
	System.out.println ("              .        )\\              ( ))");
	System.out.println ("               \\. ..-\"\"  \"\"-._          `-. _");
	System.out.println ("               /.-.,_    ))  e`.         /^\\`");
	System.out.println ("              '      \"'7/-----\"\"`");
	char answer;
	char input;
	int order;
	String spelledCorrectly;
	String spelledIncorrectly;
	System.out.println ("\"Hey! I am Poseidon. I rule the seas. My brothers are Hades and Zeus.\n\n");
	System.out.println ("R u gud @ speling? Let's play a spelling game!\n\n");
	System.out.println ("Which one is spelled correctly (Enter the letter)?");
	for (int i = 1 ; i <= 8 ; i++)
	{
	    int num = (int) (Math.random () * 20) + 1; //if you have more time, increase this number //This ensures that the user doesn't receive the same question each time
	    order = (int) (Math.random () * 2) + 1; //this mixes up the order of the answers
	    if (num == 1)
	    {
		spelledCorrectly = "Poseidon"; //insert values
		spelledIncorrectly = "Posiedon";
	    }
	    else if (num == 2)
	    {
		spelledCorrectly = "Argument";
		spelledIncorrectly = "Arguement";
	    }
	    else if (num == 3)
	    {
		spelledCorrectly = "Existence";
		spelledIncorrectly = "Existance";
	    }
	    else if (num == 4)
	    {
		spelledCorrectly = "Harass";
		spelledIncorrectly = "Harrass";
	    }
	    else if (num == 5)
	    {
		spelledCorrectly = "Judgement";
		spelledIncorrectly = "Judgment";
	    }
	    else if (num == 6)
	    {
		spelledCorrectly = "License";
		spelledIncorrectly = "Lisence";
	    }
	    else if (num == 7)
	    {
		spelledCorrectly = "Occasion";
		spelledIncorrectly = "Occassion";
	    }
	    else if (num == 8)
	    {
		spelledCorrectly = "Privilege";
		spelledIncorrectly = "Privlege";
	    }
	    else if (num == 9)
	    {
		spelledCorrectly = "Cemetery";
		spelledIncorrectly = "Cemetary";
	    }
	    else if (num == 10)
	    {
		spelledCorrectly = "Miniature";
		spelledIncorrectly = "Minature";
	    }
	    else if (num == 11)
	    {
		spelledCorrectly = "Acquaintance";
		spelledIncorrectly = "Aquaintance";
	    }
	    else if (num == 12)
	    {
		spelledCorrectly = "Fahrenheit";
		spelledIncorrectly = "Fairenheit";
	    }
	    else if (num == 13)
	    {
		spelledCorrectly = "Definitely";
		spelledIncorrectly = "Definately";
	    }
	    else if (num == 14)
	    {
		spelledCorrectly = "Grateful";
		spelledIncorrectly = "Greatful";
	    }
	    else if (num == 15)
	    {
		spelledCorrectly = "Pronunciation";
		spelledIncorrectly = "Pronounciation";
	    }
	    else if (num == 16)
	    {
		spelledCorrectly = "Entrepreneur";
		spelledIncorrectly = "Entreprenuer";
	    }
	    else if (num == 17)
	    {
		spelledCorrectly = "Accidentally ";
		spelledIncorrectly = "Acidentally ";
	    }
	    else if (num == 18)
	    {
		spelledCorrectly = "Atheist";
		spelledIncorrectly = "Athiest";
	    }
	    else if (num == 19)
	    {
		spelledCorrectly = "Dumbbell";
		spelledIncorrectly = "Dumbell";
	    }
	    else
	    {
		spelledCorrectly = "Guarantee";
		spelledIncorrectly = "Guaruntee";
	    }

	    if (order == 1)
	    {
		input = IBIO.inputChar ("\t(a) " + spelledCorrectly + "  OR\t\t(b) " + spelledIncorrectly + "?\n ");
		answer = 'A';
	    }
	    else
	    {
		input = IBIO.inputChar ("\t(a) " + spelledIncorrectly + "  OR\t\t(b) " + spelledCorrectly + "?\n ");
		answer = 'B';
	    }
	    while (!isValidAorB (input))
	    {
		input = IBIO.inputChar ("That input is invalid. Enter either A or B: \n");
	    }
	    if (input == answer || input == Character.toLowerCase (answer))
	    {
		System.out.println ("That's right!");
		points += 2;
	    }
	    else
		System.out.println ("That's not right.");
	}
	System.out.println ("\nThanks for playing! Here, take my trident.\"");
	char enter = IBIO.inputChar ("Press Enter to advance... ");
	return points;
    }


    public int Aphrodite (int points)
    {
	System.out.println ("<<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>>\n");
	System.out.println (" ,,-,-.,-. ,-. ,,-. ,-,-. ,-.-. ,-.. ,-. ,-.,-.-..");
	System.out.println ("(( (  (   (   '(   ' (   '   ) '   )'   )   )  ) ))");
	System.out.println (" \\\\ \\  \\   \\    \\    ,\\     /.    /    /   /  / //");
	System.out.println ("   \\\\ \\ /\\ / \\ /  \\ /   \\ /   \\ /  \\ / \\ /\\ / //");
	System.out.println ("    '' '  '   '    '     '     '    '   '  ' ''");
	String input;
	String answer;
	int num;
	System.out.println ("\n\"Hiya! I'm Aphrodite, the godess of love and beauty. I am married to Hepauestus, but I am really in love with Ares. I make people fall in love.\n\n");
	System.out.println ("Can you help me unscamble these words?");
	num = (int) (Math.random () * 5) + 1; //this ensures that the user doesn't always see the exact same question each time they play again
	if (num == 1)
	{
	    input = IBIO.inputString ("Y-D-R-C-A-E-O-M-C  ");
	    answer = "Democracy"; //Make the first letter uppercase and the rest of the letters lowercase
	}
	else if (num == 2)
	{
	    input = IBIO.inputString ("I-T-L-R-A-R-G-U-C-U-E  ");
	    answer = "Agriculture";
	}
	else if (num == 3)
	{
	    input = IBIO.inputString ("Y-S-P-C-O-M-L-I  ");
	    answer = "Olympics";
	}
	else if (num == 4)
	{
	    input = IBIO.inputString ("R-T-U-I-T-E-E-A-L-R  ");
	    answer = "Literature";
	}
	else
	{
	    input = IBIO.inputString ("T-A-N-A-H-E  ");
	    answer = "Athena";
	}
	if (UnscrambleisCorrect (input, answer) == true)
	    points += 3;

	num = (int) (Math.random () * 5) + 1;
	if (num == 1)
	{
	    input = IBIO.inputString ("R-E-T-I-S-A-M  ");
	    answer = "Artemis";
	}
	else if (num == 2)
	{
	    input = IBIO.inputString ("T-H-E-A-W  ");
	    answer = "Wheat";
	}
	else if (num == 3)
	{
	    input = IBIO.inputString ("V-L-E-I-O  ");
	    answer = "Olive";
	}
	else if (num == 4)
	{
	    input = IBIO.inputString ("M-C-Y-O-O-E-N  ");
	    answer = "Economy";
	}
	else
	{
	    input = IBIO.inputString ("S-H-Y-O-O-H-I-P-L-P");
	    answer = "Philosophy";
	}
	if (UnscrambleisCorrect (input, answer) == true)
	    points += 3;
	num = (int) (Math.random () * 5) + 1;
	if (num == 1)
	{
	    input = IBIO.inputString ("C-I-T-O-A-U-D-E-N");
	    answer = "Education";
	}
	else if (num == 2)
	{
	    input = IBIO.inputString ("G-N-I-N-H-G-I-L-T");
	    answer = "Lightning";
	}
	else if (num == 3)
	{
	    input = IBIO.inputString ("E-I-O-A-P-H-T-D-R");
	    answer = "Aphrodite";
	}
	else if (num == 4)
	{
	    input = IBIO.inputString ("Y-O-O-G-M-L-H-T-Y");
	    answer = "Mythology";
	}
	else
	{
	    input = IBIO.inputString ("V-T-I-Z-A-C-N-I-L-I-I-O");
	    answer = " ";
	}
	if (UnscrambleisCorrect (input, answer) == true)
	    points += 3;
	System.out.println ("\nIt was nice getting to know you! I wish you luck in the future. As a gift, take my mirror.\"");
	char enter = IBIO.inputChar ("\nPress Enter to advance... ");
	return points;
    }


    public boolean UnscrambleisCorrect (String input, String answer)
    {
	if (input.equals (answer) || input.equals (answer.toLowerCase ()) || input.equals (answer.toUpperCase ()))
	{
	    System.out.println ("\nCorrect!\n");
	    return true;
	}
	else
	{
	    System.out.println ("\nNope. The correct answer is: " + answer.toLowerCase () + "\n");//converts the answer to lowercase letters
	    return false;
	}
    }


    public int Hera (int points)
    {
	System.out.println ("<<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>>\n");
	System.out.println ("                         --.");
	System.out.println ("          @@@           /  ))");
	System.out.println ("         (( }           7_ /");
	System.out.println ("         ``)             / \\");
	System.out.println ("        ``( \\           |<| |");
	System.out.println ("       ```\\`.\\__     __/|/| |");
	System.out.println ("      ```` )|---~o_)|___| | |");
	System.out.println ("     ~~~~~/ \\`          | |_|");
	System.out.println ("         / ' \\`         |__>)");
	System.out.println ("        /  '  \\`        || |");
	System.out.println ("       /   '    `       |\\ \\");
	System.out.println ("      /   _!__.-._`     | \\ \\");
	System.out.println ("     /_.-'  ( |         | |\\ \\");
	System.out.println ("        /    `|         |_| \\_\\");
	System.out.println ("       |`_   |`_      __'_)__.-'");
	char input;
	System.out.println ("I'm Hera, the Queen of the Gods. Zeus is my husband. I am the godess of marriage and the protector of women.\n");
	System.out.println ("Let's see how compatible we are!");
	for (int i = 0 ; i <= 10 ; i++)
	{
	    System.out.print ("Question #" + (i + 1) + ", ");
	    if (i == 0)
		input = IBIO.inputChar ("When openly discussing in class you...\n\t(a) are happy to sit back and listen, agreeing with what others have to say.\n\t(b) are happy to listen to the opinions of other, yet contribute when others are in need of your ideas.\n\t(c) are quick to share and argue your thoughts.\n\t>> ");
	    else if (i == 1)
		input = IBIO.inputChar ("Your friends would best describe you as...\n\t(a) kind, sweet and shy\n\t(b) happy go lucky, relaxed and caring\n\t(c) certain, bold and outgoing\n\t>> ");
	    else if (i == 2)
		input = IBIO.inputChar ("When choosing what to do with friends you...\n\t(a) allow everyone to state opinion and agree with all that has been said\n\t(b) offer a few ideas, but don't really mind as whatever is great with you, you just love hanging with your friends\n\t(c) rapidly state what you would like to do and make sure it is done\n\t>> ");
	    else if (i == 3)
		input = IBIO.inputChar ("If you were stuck on an island which role would you be most likely to perform?\n\t(a) The follower, you would listen to advice and take it on board, trying to help everyone.\n\t(b) The calm, you have a few ideas to help yet you allow others to lead, you are the optimist everyone needs in the situation.\n\t(c) The leader, taking control and advising and directing everyone to saftey.\n\t>> ");
	    else if (i == 4)
		input = IBIO.inputChar ("Are looks important?\n\t(a) Not at all\n\t(b) Sometimes\n\t(c) Very\n\t>> ");
	    else if (i == 5)
		input = IBIO.inputChar ("On a scale of 1-10- 1 being ugly, 10 being stunning how would you rate yourself?\n\t(a) Below 5\n\t(b) 5-8\n\t(c) 9-10\n\t>> ");
	    else if (i == 6)
		input = IBIO.inputChar ("How often do you wear makeup?\n\t(a) Never\n\t(b) Sometimes\n\t(c) Often\n\t>> ");
	    else if (i == 7)
		input = IBIO.inputChar ("Do you ever look yourself in the mirror and think \"Yeah...Im hot\"\n\t(a) Rarely\n\t(b) Sometimes\n\t(c) All the time\n\t>> ");
	    else if (i == 8)
		input = IBIO.inputChar ("How often do you post a picture of yourself on Instagram/Facebook/other social media sites?\n\t(a) Rarely/Never\n\t(b) Occasionally\n\t(c) All the time\n\t>> ");
	    else if (i == 9)
		input = IBIO.inputChar ("How long does it take you to get ready when you're going out?\n\t(a) less than 30 minutes\n\t(b) 30 minutes to 1 1/2 hours\n\t(c) More than 1 1/2 hours\n\t>> ");
	    else
		input = IBIO.inputChar ("On the first day of school, a girl accidently spills chili on your new juicy couture handbag after you prop your feet up on the booth across from\nyou in the cafeteria. You...\n\t(a) start crying. Not because you are sad, but because that girl feels so bad.\n\t(b) tell her it's ok even though you are really angry. You tell her you are kind of angry but you'll survive.\n\t(c) scream and yell at her and make a scene. How rude of her to dump chili on your handbag!\n\t>> ");
	    while (!QuizinputValid (input))
	    {
		input = IBIO.inputChar ("That is not one of the available options. Choose from A, B, or C. ");
	    }
	    if (input == 'C' || input == 'c')
		points++;//the more compatible the user is with Hera, the more points they receive
	    System.out.println ();
	}
	if (points > 7)
	    System.out.println ("\nWe are so compatible! We should be best friends!");
	else if (points > 4)
	    System.out.println ("\nWe are somewhat compatible. We may not be close, but we can still be friends.");
	else
	    System.out.println ("\nWe are absolutely not compatible! You disgust me!");
	System.out.println ("\n\nYou received " + points + " point(s).\nTake this gold ring as a gift.\"");
	char enter = IBIO.inputChar ("\nPress Enter to advance... ");
	return points;
    }


    public boolean QuizinputValid (char input)
    {
	if (input == 'A' || input == 'a' || input == 'B' || input == 'b' || input == 'C' || input == 'c')
	    return true;
	else
	    return false;
    }


    public int Apollo (int points)
    {      
	System.out.println ("<<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>>\n");
	System.out.println (" ¶¶¶¶                         ¶¶");
	System.out.println ("  ¶¶¶¶¶                       ¶¶");
	System.out.println ("  ¶¶  ¶¶                     ¶¶¶¶");
	System.out.println ("   ¶¶  ¶¶                    ¶¶¶¶¶");
	System.out.println ("    ¶¶ ¶¶¶                   ¶¶  ¶¶");
	System.out.println ("    ¶¶ ¶¶¶                   ¶¶  ¶¶");
	System.out.println ("     ¶¶¶¶¶                   ¶¶ ¶¶¶");
	System.out.println ("     ¶¶¶¶              ¶¶¶¶ ¶¶  ¶¶");
	System.out.println ("    ¶¶¶¶             ¶¶¶¶¶¶¶¶¶ ¶¶");
	System.out.println ("   ¶¶¶ ¶¶  ¶¶¶       ¶¶¶¶¶¶¶¶");
	System.out.println ("  ¶¶¶   ¶¶¶¶¶¶¶¶¶     ¶¶¶¶¶¶");
	System.out.println (" ¶¶¶¶  ¶¶¶¶   ¶¶¶¶                       ¶¶¶");
	System.out.println (" ¶¶¶  ¶¶¶¶ ¶¶¶  ¶¶¶                  ¶¶¶¶¶¶");
	System.out.println ("¶¶¶¶  ¶¶¶¶¶¶¶¶¶  ¶¶¶              ¶¶¶¶¶¶¶¶¶");
	System.out.println (" ¶¶¶  ¶¶¶ ¶¶  ¶  ¶¶¶           ¶¶¶¶¶¶¶   ¶¶");
	System.out.println (" ¶¶¶¶  ¶¶¶¶¶¶¶¶  ¶¶        ¶¶¶¶¶¶¶¶      ¶¶");
	System.out.println ("  ¶¶¶¶    ¶¶¶  ¶¶¶      ¶¶¶¶¶¶¶¶¶¶       ¶¶");
	System.out.println ("   ¶¶¶¶¶¶   ¶¶¶¶¶     ¶¶¶¶¶¶¶¶   ¶¶       ¶¶");
	System.out.println ("     ¶¶¶¶¶¶¶¶¶¶        ¶¶¶¶¶     ¶¶   ¶¶¶¶¶¶");
	System.out.println ("        ¶¶¶ ¶¶¶        ¶¶        ¶¶  ¶¶¶¶¶¶¶");
	System.out.println ("       ¶¶¶¶¶ ¶¶       ¶¶¶     ¶¶¶¶   ¶¶¶¶¶");
	System.out.println ("       ¶¶¶   ¶¶         ¶¶   ¶¶¶¶¶¶");
	System.out.println ("         ¶¶¶¶¶          ¶¶   ¶¶¶¶¶¶");
	System.out.println ("                         ¶¶  ¶¶¶¶");
	System.out.println ("                     ¶¶¶¶¶¶");
	System.out.println ("                    ¶¶¶¶¶¶¶ ");
	String joke;
	String answer;
	char correct = 'n';
	String uAnswer;
	int tries = 1;
	int question; //indicates which joke was asked by the computer
	System.out.println ("\n\"I am Apollo, the god of wisdom, poety, light and music. I am the twin brother of Artemis. I also really like lions and wWlves.\n\n");
	System.out.println ("Can you tell good jokes? I sure can!\n\n");
	int num = (int) (Math.random () * 3) + 1; //computer chooses 1 of 3 different jokes each time randomly
	if (num == 1)
	{
	    joke = "Why was Hera jealous of Chiron?";
	    question = 1;
	    answer = "He was the Centaur of attention.";

	}
	else if (num == 2)
	{
	    joke = "What does a house wear?";
	    question = 2;
	    answer = "Address";
	}
	else
	{
	    joke = "What is the most curious letter";
	    question = 3;
	    answer = "Y";
	}
	points = checkJoke (joke, question, answer, points);
	num = (int) (Math.random () * 3) + 1;
	if (num == 1)
	{
	    joke = "What is a favorite game of Greeks?";
	    question = 4;
	    answer = "Hydra and go seek";

	}
	else if (num == 2)
	{
	    joke = "What has 13 hearts, but no other organs?";
	    question = 5;
	    answer = "A deck of playing cards";
	}
	else
	{
	    joke = "What do you break before you use it?";
	    question = 6;
	    answer = "An egg";
	}
	points += checkJoke (joke, question, answer, points);
	num = (int) (Math.random () * 3) + 1;
	if (num == 1)
	{
	    joke = "Why was the chef embarrassed?";
	    question = 7;
	    answer = "He saw the salad dressing";

	}
	else if (num == 2)
	{
	    joke = "What five-letter word becomes shorter when you add two letters to it?";
	    question = 8;
	    answer = "Short";
	}
	else
	{
	    joke = "What falls but never gets hurt?";
	    question = 9;
	    answer = "Rain";
	}
	points += checkJoke (joke, question, answer, points);
	num = (int) (Math.random () * 3) + 1;
	if (num == 1)
	{
	    joke = "Why did the boy throw a bucket out the window?";
	    question = 10;
	    answer = "He wanted to see the waterfall.";

	}
	else if (num == 2)
	{
	    joke = "Why did the boy throw butter out the window?";
	    question = 11;
	    answer = "He wanted to see the butterfly.";
	}
	else
	{
	    joke = "Why did the boy throw his watch out the window?";
	    question = 12;
	    answer = "He wanted to see time fly.";
	}
	points += checkJoke (joke, question, answer, points);
	System.out.println ("\nThanks for listening to my jokes! Here, take my lyre as a gift.\"\n");
	char enter = IBIO.inputChar ("Press Enter to advance... ");
	return points;
    }


    public int checkJoke (String joke, int question, String answer, int points)
    {
	int tries = 1;
	char correct;
	String uAnswer = IBIO.inputString ("\n" + joke + " ");
	correct = checkJokeAnswer (question, uAnswer);

	while (correct == 'n' && tries < 4)
	{
	    uAnswer = IBIO.inputString ("\n\"Sorry, that's not the right answer. Try again.(Press -1 to give up)\" "); //allows users to quit
	    correct = checkJokeAnswer (question, uAnswer);
	    tries++;
	}
	if (correct == 'y')
	{
	    System.out.print ("\n\"That's correct! You received 5 points.\"");
	    points += 5;//points are collected
	}
	else
	    System.out.print ("\n\"Here's the answer: " + answer + "\"");
	return points;
    }


    public char checkJokeAnswer (int question, String uAnswer)
    {
	char answer = 'n';
	if (uAnswer.equals ("-1")) //user wishes to quit
	    return 'q';
	else if (question == 1) //multiple forms of the answer are acceptable
	{
	    if (uAnswer.equals ("He was the Centaur of attention") || uAnswer.equals ("He was the Centaur of attention.") || uAnswer.equals ("he was the Centaur of attention") || uAnswer.equals ("he was the Centaur of attention.") || uAnswer.equals ("Because he was the Centaur of attention") || uAnswer.equals ("Because he was the Centaur of attention.") || uAnswer.equals ("because he was the Centaur of attention") || uAnswer.equals ("because he was the Centaur of attention.") || uAnswer.equals ("He was the centaur of attention") || uAnswer.equals ("He was the centaur of attention.") || uAnswer.equals ("he was the centaur of attention") || uAnswer.equals ("he was the centaur of attention.") || uAnswer.equals ("Because he was the centaur of attention") || uAnswer.equals ("Because was the centaur of attention.") || uAnswer.equals ("because he was the centaur of attention") || uAnswer.equals ("because he was the centaur of attention."))
	    {
		answer = 'y';
	    }
	    else
		answer = 'n';
	}
	else if (question == 2)
	{
	    if (uAnswer.equals ("Address") || uAnswer.equals ("ADDRESS") || uAnswer.equals ("address") || uAnswer.equals ("A DRESS") || uAnswer.equals ("A dress") || uAnswer.equals ("A Dress") || uAnswer.equals ("a dress"))
	    {
		answer = 'y';
	    }
	    else
		answer = 'n';
	}
	else if (question == 3)
	{
	    if (uAnswer.equals ("Y") || uAnswer.equals ("y") || uAnswer.equals ("Y?") || uAnswer.equals ("y?") || uAnswer.equals ("Why") || uAnswer.equals ("Why?") || uAnswer.equals ("why?") || uAnswer.equals ("why") || uAnswer.equals ("WHY") || uAnswer.equals ("WHY?"))
	    {
		answer = 'y';
	    }
	    else
		answer = 'n';
	}
	else if (question == 4)
	{
	    if (uAnswer.equals ("Hydra and go seek") || uAnswer.equals ("Hydra and go seek.") || uAnswer.equals ("hydra and go seek") || uAnswer.equals ("hydra and go seek.") || uAnswer.equals ("HYDRA and go seek.") || uAnswer.equals ("HYDRA and go seek") || uAnswer.equals ("Hide and go seek") || uAnswer.equals ("Hide and go seek.") || uAnswer.equals ("hide and go seek.") || uAnswer.equals ("hide and go seek") || uAnswer.equals ("Hydra and seek") || uAnswer.equals ("Hydra and seek.") || uAnswer.equals ("hydra and seek") || uAnswer.equals ("hydra and seek.") || uAnswer.equals ("HYDRA and seek.") || uAnswer.equals ("HYDRA and seek") || uAnswer.equals ("Hide and seek") || uAnswer.equals ("Hide and seek.") || uAnswer.equals ("hide and seek.") || uAnswer.equals ("hide and seek") || uAnswer.equals ("Hydra-and-go-seek") || uAnswer.equals ("Hydra-and-go-seek.") || uAnswer.equals ("hydra-and-go-seek") || uAnswer.equals ("hydra-and-go-seek.") || uAnswer.equals ("HYDRA-and-go-seek.") || uAnswer.equals ("HYDRA-and-go-seek") || uAnswer.equals ("Hide-and-go-seek") || uAnswer.equals ("Hide-and-go-seek.") || uAnswer.equals ("hide-and-go-seek.") || uAnswer.equals ("hide-and-go-seek") || (uAnswer.equals ("Hydra-and-seek") || uAnswer.equals ("Hydra-and-seek.") || uAnswer.equals ("hydra-and-seek") || uAnswer.equals ("hydra-and-seek.") || uAnswer.equals ("HYDRA-and-seek.") || uAnswer.equals ("HYDRA-and-seek") || uAnswer.equals ("Hide-and-seek") || uAnswer.equals ("Hide-and-seek.") || uAnswer.equals ("hide-and-seek.") || uAnswer.equals ("hide-and-seek")))
	    {
		answer = 'y';
	    }
	    else
		answer = 'n';
	}
	else if (question == 5)
	{
	    if (uAnswer.equals ("A deck of playing cards") || uAnswer.equals ("a deck of playing cards") || uAnswer.equals ("deck of playing cards") || uAnswer.equals ("Deck of playing cards") || uAnswer.equals ("A deck of cards") || uAnswer.equals ("a deck of cards") || uAnswer.equals ("deck of cards") || uAnswer.equals ("Deck of cards") || uAnswer.equals ("Playing cards") || uAnswer.equals ("playing cards") || uAnswer.equals ("cards") || uAnswer.equals ("Cards") || (uAnswer.equals ("A deck of playing cards.") || uAnswer.equals ("a deck of playing cards.") || uAnswer.equals ("deck of playing cards.") || uAnswer.equals ("Deck of playing cards.") || uAnswer.equals ("A deck of cards.") || uAnswer.equals ("a deck of cards.") || uAnswer.equals ("deck of cards.") || uAnswer.equals ("Deck of cards.") || uAnswer.equals ("Playing cards.") || uAnswer.equals ("playing cards.") || uAnswer.equals ("cards.") || uAnswer.equals ("Cards.")))
	    {
		answer = 'y';
	    }
	    else
		answer = 'n';
	}
	else if (question == 6)
	{
	    if (uAnswer.equals ("An egg") || uAnswer.equals ("an egg") || uAnswer.equals ("egg") || uAnswer.equals ("Egg") || uAnswer.equals ("Eggs") || uAnswer.equals ("eggs"))
	    {
		answer = 'y';
	    }
	    else
		answer = 'n';
	}
	else if (question == 7)
	{
	    if (uAnswer.equals ("He saw the salad dressing") || uAnswer.equals ("he saw the salad dressing") || uAnswer.equals ("Because he saw the salad dressing") || uAnswer.equals ("because he saw the salad dressing") || uAnswer.equals ("the salad was dressing") || uAnswer.equals ("The salad was dressing") || uAnswer.equals ("He saw the salad dressing.") || uAnswer.equals ("he saw the salad dressing.") || uAnswer.equals ("Because he saw the salad dressing.") || uAnswer.equals ("because he saw the salad dressing.") || uAnswer.equals ("the salad was dressing.") || uAnswer.equals ("The salad was dressing.")|| uAnswer.equals ("because of the salad dressing"))
	    {
		answer = 'y';
	    }
	    else
		answer = 'n';
	}
	else if (question == 8)
	{
	    if (uAnswer.equals ("Short") || uAnswer.equals ("SHORT") || uAnswer.equals ("short"))
	    {
		answer = 'y';
	    }
	    else
		answer = 'n';
	}
	else if (question == 9)
	{
	    if (uAnswer.equals ("Rain") || uAnswer.equals ("RAIN") || uAnswer.equals ("rain"))
	    {
		answer = 'y';
	    }
	    else
		answer = 'n';
	}
	else if (question == 10)
	{
	    if (uAnswer.equals ("He wanted to see the waterfall") || uAnswer.equals ("He wanted to see a waterfall") || uAnswer.equals ("He wanted to see water fall") || uAnswer.equals ("He wanted to see the water fall") || uAnswer.equals ("he wanted to see the waterfall") || uAnswer.equals ("he wanted to see a waterfall") || uAnswer.equals ("he wanted to see water fall") || uAnswer.equals ("he wanted to see the water fall") || uAnswer.equals ("Because he wanted to see the waterfall") || uAnswer.equals ("Because he wanted to see a waterfall") || uAnswer.equals ("Because he wanted to see water fall") || uAnswer.equals ("Because he wanted to see the water fall") || uAnswer.equals ("To see the water fall") || uAnswer.equals ("To see a waterfall") || uAnswer.equals ("To see the waterfall") || uAnswer.equals ("to see the water fall") || uAnswer.equals ("to see a waterfall") || uAnswer.equals ("to see the waterfall") || uAnswer.equals ("He wanted to see the waterfall.") || uAnswer.equals ("He wanted to see a waterfall.") || uAnswer.equals ("He wanted to see water fall.") || uAnswer.equals ("He wanted to see the water fall.") || (uAnswer.equals ("he wanted to see the waterfall.") || uAnswer.equals ("he wanted to see a waterfall.") || uAnswer.equals ("he wanted to see water fall.") || uAnswer.equals ("he wanted to see the water fall.") || uAnswer.equals ("Because he wanted to see the waterfall.") || uAnswer.equals ("Because he wanted to see a waterfall.") || uAnswer.equals ("Because he wanted to see water fall.") || uAnswer.equals ("Because he wanted to see the water fall.") || uAnswer.equals ("To see the water fall.") || uAnswer.equals ("To see a waterfall.") || uAnswer.equals ("To see the waterfall.") || uAnswer.equals ("to see the water fall.") || uAnswer.equals ("to see a waterfall.") || uAnswer.equals ("to see the waterfall.")))
	    {
		answer = 'y';
	    }
	    else
		answer = 'n';
	}
	else if (question == 11)
	{
	    if (uAnswer.equals ("He wanted to see the butterfly") || uAnswer.equals ("He wanted to see a butterfly") || uAnswer.equals ("He wanted to see the butter fly") || uAnswer.equals ("he wanted to see the butterfly") || uAnswer.equals ("he wanted to see a butterfly") || uAnswer.equals ("he wanted to see butter fly") || uAnswer.equals ("he wanted to see the butter fly") || uAnswer.equals ("Because he wanted to see the butterfly") || uAnswer.equals ("Because he wanted to see a butterfly") || uAnswer.equals ("Because he wanted to see butter fly") || uAnswer.equals ("Because he wanted to see the butter fly") || uAnswer.equals ("To see the butter fly") || uAnswer.equals ("To see a butterfly") || uAnswer.equals ("To see the butterfly") || uAnswer.equals ("to see the butter fly") || uAnswer.equals ("to see a butterfly") || uAnswer.equals ("to see the butterfly") || uAnswer.equals ("He wanted to see the butterfly.") || uAnswer.equals ("He wanted to see a butterfly.") || uAnswer.equals ("He wanted to see butter fly.") || uAnswer.equals ("He wanted to see the butter fly.") || (uAnswer.equals ("he wanted to see the butterfly.") || uAnswer.equals ("he wanted to see a butterfly.") || uAnswer.equals ("he wanted to see butter fly.") || uAnswer.equals ("he wanted to see the butter fly.") || (uAnswer.equals ("Because he wanted to see the butterfly.") || uAnswer.equals ("Because he wanted to see a butterfly.") || uAnswer.equals ("Because he wanted to see butter fly.") || uAnswer.equals ("Because he wanted to see the butter fly.") || uAnswer.equals ("To see the butter fly.") || uAnswer.equals ("To see a butterfly.") || uAnswer.equals ("To see the butterfly.") || uAnswer.equals ("to see the butter fly.") || uAnswer.equals ("to see a butterfly.") || uAnswer.equals ("to see the butterfly."))))
	    {
		answer = 'y';
	    }
	    else
		answer = 'n';
	}
	else if (question == 12)
	{
	    if (uAnswer.equals ("He wanted to see time fly") || uAnswer.equals ("he wanted to see time fly") || uAnswer.equals ("Because he wanted to see time fly") || uAnswer.equals ("because he wanted to see time fly") || uAnswer.equals ("To see time fly") || uAnswer.equals ("He wanted to see time fly.") || (uAnswer.equals ("he wanted to see time fly.") || uAnswer.equals ("Because he wanted to see time fly.") || uAnswer.equals ("because he wanted to see time fly.") || uAnswer.equals ("To see time fly.")|| uAnswer.equals ("to see time fly")))
	    {
		answer = 'y';
	    }
	    else
		answer = 'n';
	}

	return answer;

    }


    public void meetingSeth ()
    {
	System.out.println ("\n\n\nIt's time to go home! Using the artifacts that each god gave you:");
	delay (2000);
	System.out.println ("\n\tA shield from Ares");
	delay (2000);
	System.out.println ("\n\tThe cornucopia from Hades");
	delay (2000);
	System.out.println ("\n\tA golden arrow from Artemis");
	delay (2000);
	System.out.println ("\n\tAn owl pendant from Athena");
	delay (2000);
	System.out.println ("\n\tA magic wand from Hermes");
	delay (2000);
	System.out.println ("\n\tA trident from Poseidon");
	delay (2000);
	System.out.println ("\n\tA mirror from Aphrodite");
	delay (2000);
	System.out.println ("\n\tA golden ring from Hera");
	delay (2000);
	System.out.println ("\n\tA lyre from Apollo");
	delay (2000);
	System.out.println ("\n\tAnd the spell");
	delay (2000);
	System.out.println ("a portal will appear to return you to the present time.");
	delay (4000);
	Portal ();
	delay (300);
	System.out.println ("\"Mwhahahahahaha, I am Seth, the Ancient Egyptian god of evil. The portal transported you to Ancient Egypt!\nYou really thought Zeus gave you the right spell? Zeus is never that nice! Now, you must bow down to me and live under my commands in Egypt forever!!! Mwhahahahaha!!\nUnless...\nYou defeat me in a game I like to call Nim.\"");
	delay (7000);
	JOptionPane.showMessageDialog (null, "* * * H O W    T O    P L A Y * * * \n \n"
		+ "Task: To defeat Seth in Nim. \n"
		+ " There are 20 stones to begin with. \n \n"
		+ " Each player takes turns either removing 1 stone, 2 stones, or 3 stones. \n"
		+ " The player who removes the last stone loses. \n"
		+ " Defeat Seth, or face an enternity of slavery under Seth's orders.", "Instructions", JOptionPane.QUESTION_MESSAGE);
	System.out.println ("\"Let's play!\"");
    }


    public int Seth (String name, int points)
    {
	int num;
	int turn;
	int left = 20;
	String order = IBIO.inputString (name + ", do you want to go first or second?"); //user gets to choose whether or not if they want to go first or second
	if (order.equals ("First") || order.equals ("FIRST") || order.equals ("first") || order.equals ("1st") || order.equals ("1ST"))
	{
	    turn = 1;
	    System.out.println ("Okay! You're going first.");
	}
	else
	{
	    turn = 2;
	    System.out.println ("Okay! You're going second.");
	}
	while (left > 0)
	{
	    drawLeft (left);
	    if (turn == 1)
	    {
		left = turn (left);
		turn = 2;
	    }
	    else
	    {
		num = (int) (Math.random () * 3) + 1;
		while (num > left)
		{
		    num = (int) (Math.random () * 3) + 1;
		}
		System.out.println ("\nI took " + num + " stone(s).");
		left -= num;
		turn = 1;

	    }
	}
	if (turn == 2)
	    System.out.println ("\"Seth won! I, ruler of Egypt, am being very very unsually nice. I will let you go and send you back home.\"");
	else
	{
	    System.out.println ("WHAT?! How could you win against me, the greatest god of all time? Oh well, I have to send you free. Goodbye fellow mortal!");
	    points += 5;
	}
	Portal ();
	return points;
    }


    public int turn (int left) 
    {
	int amt = IBIO.inputInt ("How many stones do you want to remove? ");
	while (!stonesValid (amt, left))
	{
	    System.out.println("That input is invalid. Pick either 1, 2, or 3. The number of stones you remove must be greater than the number of stones left.");
	    amt = IBIO.inputInt ("How many stones do you want to remove? ");
	}
	return left - amt;
    }


    public boolean stonesValid (int amt, int left) //checks to see if the user's choice is valid
    {
	if (amt > left)
	    return false;
	else if (amt == 1 || amt == 2 || amt == 3)
	    return true;
	else
	    return false;
    }


    public void drawLeft (int left)
    {
	System.out.println ("\nStones Remaining: " + left + "\n");
	for (int i = 1 ; i <= left ; i++)
	    System.out.print (" _ "); //draws how many stones are left
	System.out.println ();
	for (int i = 1 ; i <= left ; i++)
	    System.out.print ("(_)"); //draws how many stones are left
	System.out.println ();
    }



    public void Portal ()
    {
	char enter = IBIO.inputChar ("Press Enter ");
	System.out.println ("\n\n\n\n                    ,MMMMMMMMMMMMN.        ");
	System.out.println ("               .8MMMMMMMMMMMMMMMMMMMMMO    ");
	System.out.println ("             MMMMMMMMMMMMMMMMMMMMMMMMMMMMD      ");
	System.out.println ("          :MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM.        ");
	System.out.println ("         MMMMMMMMMMMMMMMMNOZDMMMMMMMMMMMMMMMMM            ");
	System.out.println ("       ~MMMMMMMMMMMZ              7MMMMMMMMMMMM~            ");
	System.out.println ("      MMMMMMMMMMZ                   .8MMMMMMMMMMD           ");
	System.out.println ("     MMMMMMMMM,                        DMMMMMMMMM8          ");
	System.out.println ("    =MMMMMMMN.                          .MMMMMMMMM=         ");
	System.out.println ("   .MMMMMMMZ                              MMMMMMMMM.        ");
	System.out.println ("   MMMMMMM.             ,7DM8+             MMMMMMMMM        ");
	System.out.println ("  =MMMMMM~           $MMMMMMMMMMM          ?MMMMMMMM.       ");
	System.out.println ("  MMMMMMM          IMMMMMMMMMMMMMMZ.        MMMMMMMMM       ");
	System.out.println ("  MMMMMM          MMMMMMMMMMMMMMMMMM        MMMMMMMMM.      ");
	System.out.println (" =MMMMM8        .MMMMMMMMM?   =MMMMM        7MMMMMMMM.      ");
	System.out.println (" NMMMMM         NMMMMMMMM       MMMM:       8MMMMMMMM.      ");
	System.out.println (" MMMMMM         MMMMMMMM    MM= MMMM.       MMMMMMMMM.      ");
	System.out.println (" MMMMMM        IMMMMMMMM   ~MM8MMMMN       .MMMMMMMMM       ");
	System.out.println (" OMMMMM        OMMMMMMMM    .MMMMM.        MMMMMMMMM?       ");
	System.out.println (" .MMMMM        7MMMMMMMM       .          MMMMMMMMMM        ");
	System.out.println ("  MMMMM        .MMMMMMMMM               .MMMMMMMMMM:        ");
	System.out.println ("  NMMMMZ        MMMMMMMMMM,           .MMMMMMMMMMMN         ");
	System.out.println ("  .MMMMM        .MMMMMMMMMMMD       ZMMMMMMMMMMMMM.         ");
	System.out.println ("   DMMMM8        ,MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM           ");
	System.out.println ("    MMMMM         ,MMMMMMMMMMMMMMMMMMMMMMMMMMMMN            ");
	System.out.println ("    .MMMMM          MMMMMMMMMMMMMMMMMMMMMMMMMM.             ");
	System.out.println ("      MMMMM.          MMMMMMMMMMMMMMMMMMMMMM.               ");
	System.out.println ("      .MMMMM           .IMMMMMMMMMMMMMMMM,.                 ");
	System.out.println ("        MMMMMM              ,NMMMMMMI .                     ");
	System.out.println ("         =MMMMM~                                  .         ");
	System.out.println ("           8MMMMMZ                             ,:           ");
	System.out.println ("             MMMMMMM+                      .:M .            ");
	System.out.println ("               .MMMMMMMM7 .             :MMN                ");
	System.out.println ("                  :NMMMMMMMMMMMMMMMMMMMM$.                  ");
	System.out.println ("                       ~OMMMMMMMMMDO,    ");

    }


    public void storyEnding (int totalScore, String name) //story continues
    {
	System.out.println ("\n...Continuing from where we left off...\n\n");
	delay (1000);
	System.out.println ("\t\t\t \"" + name + "! You're going to miss the school bus. Wake up!\"");
	delay (1500);
	System.out.println ("\nYou realize that you're back in your home and the whole trip was just a dream.");
	delay (2500);
	System.out.println ("\nYou lost time to study because you fell asleep, but the dream helped you remember everything you needed to know for the test.\n");
	delay (6000);
	System.out.println ("You received " + totalScore + " points.");
	if (totalScore > 75) //user won
	    certificate (totalScore, name);
	else //user lost
	{
	    System.out.println ("You did not achieve more than 75 points. You only received " + totalScore + ". As a result, you lost.\n\n\n");
	    System.out.println ("Y88b   d88P .d88888b. 888     888     888      .d88888b.  .d8888b.88888888888 ");
	    System.out.println (" Y88b d88P d88P\" \"Y88b888     888     888     d88P\" \"Y88bd88P  Y88b   888 ");
	    System.out.println ("  Y88o88P  888     888888     888     888     888     888Y88b.        888 ");
	    System.out.println ("   Y888P   888     888888     888     888     888     888 \"Y888b.     888 ");
	    System.out.println ("    888    888     888888     888     888     888     888    \"Y88b.   888 ");
	    System.out.println ("    888    888     888888     888     888     888     888      \"888   888 ");
	    System.out.println ("    888    Y88b. .d88PY88b. .d88P     888     Y88b. .d88PY88b  d88P   888 ");
	    System.out.println ("    888     \"Y88888P\"  \"Y88888P\"      88888888 \"Y88888P\"  \"Y8888P\"    888 \n\n");
	    System.out.println ("........................................");
	    System.out.println ("............ M...........7M.............");
	    System.out.println ("..........$..................M..........");
	    System.out.println ("........ ..................... M........");
	    System.out.println ("......M......................... ,......");
	    System.out.println (".  . ,...... MM ........,MM ......M.....");
	    System.out.println (".... .......MMMM........MMMM.......M....");
	    System.out.println (". . .......MMMMMM......MMMMM........M...");
	    System.out.println ("..M........MMMMMO......MMMMM .......  ..");
	    System.out.println (".. .........MMMM....... MMMM.........M..");
	    System.out.println (".............MM ........ MM .........M..");
	    System.out.println (".M......................................");
	    System.out.println (".M......................................");
	    System.out.println (".M...................................~..");
	    System.out.println ("...............MMMO~MMMO.............M..");
	    System.out.println ("..M......... M.......... MZ.......... ..");
	    System.out.println ("..  .......M ..............M .......M...");
	    System.out.println ("...8......  .......................M....");
	    System.out.println ("....M.............................M ....");
	    System.out.println ("..... ...........................M......");
	    System.out.println (".......M................................");
	    System.out.println ("........ M...................? .........");
	    System.out.println ("............M.............ZD............");
	    System.out.println ("............... .DMMMM  ................");
	    System.out.println ("........................................");
	}
    }


    public void certificate (int totalScore, String name)
    {
	System.out.println (" /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  ");
	System.out.println ("/__\\/__\\/__\\/__\\/__\\/__\\/__\\/__\\/__\\/__\\/__\\/__\\/__\\/__\\/__\\/__\\/__\\/__\\/__\\/__\\");
	System.out.println ("\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /");
	System.out.println (" \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/");
	System.out.println ("                          C O N G R A T U L A T I O N S ! ! !  ");
	System.out.println ("\t\t\t" + name + " has demonstrated a high degree of success \n\t\t\tin Gods of Greece with an");
	System.out.println ("\t\t\toutstanding score of " + totalScore + "!\n");
	System.out.println ("\t\t\tWay to go! You won the game!");
	System.out.println (" /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  ");
	System.out.println ("/__\\/__\\/__\\/__\\/__\\/__\\/__\\/__\\/__\\/__\\/__\\/__\\/__\\/__\\/__\\/__\\/__\\/__\\/__\\/__\\");
	System.out.println ("\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /");
	System.out.println (" \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  ");


    }
} //class!




