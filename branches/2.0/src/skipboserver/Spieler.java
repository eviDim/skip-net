package skipboserver;

import java.io.*;
import java.net.*;

/**
 * �berschrift: Beschreibung: Copyright: Copyright (c) 2001 Organisation:
 * 
 * @author @version 1.0
 */
public class Spieler
{

	public String name;
	public ObjectInputStream in;
	public ObjectOutputStream out;

	public Spieler(String name, ObjectInputStream in, ObjectOutputStream out)
	{
		this.name = name;
		this.in = in;
		this.out = out;
	}
}