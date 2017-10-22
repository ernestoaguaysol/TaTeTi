package Modelo;

public class juego 
{
	private byte turno = 1;//el primer turno siempre es del jugador uno
	private String marcaX = "X";
	private String marcaO = "O";
	private boolean error = false;//por si acaso algun error
	private byte ganador = 0; //1=gano jugador 1, 2=gano jugador 2, 3 = empate.
	private String tablero[][] = {{"","",""}, //matriz para
								  {"","",""}, //almacenar los
								  {"","",""}};//movimientos del juego
	
	public juego(){} //cons
	
	public void jugarOtraVez()//reiniciar valores y limpiar tablero
	{
		
		for(int i = 0; i<tablero.length; i++)
			for (int j=0; j<tablero.length; j++)
				tablero [i][j] = "";
		this.error = false;
		this.ganador = 0;
		this.turno = 1;
	}
	
	//dado una posicion y segun el turno que corresponda
    //coloca la marca "X" o "O" en el tablero
    //Salida: La marca que se coloco en la matriz
	public String setMovimiento(int pos)
	{
		String out = "";
		if(turno == 1)
		{
			out = marcar(pos, this.marcaX);
			//si no se pueden marcar continua con su turno
			turno = 2;
			if(gano(this.tablero, this.marcaX))
				this.ganador = 1;
			else if(empate())
				this.ganador = 3;
		}
		else
		{
			out =  marcar(pos , this.marcaO);
            turno = 1;
            if ( gano(this.tablero, this.marcaO) )
                this.ganador = 2;
            else if ( empate() )
                this.ganador = 3;
		}
		return out;
	}
	
	/* MARCA LA CASILLA CON EL MOVIMIENTO DEL JUGADOR, */
	private String marcar(int pos, String value)
	{
		String marca = "";
		switch (pos)
		{
			case 1:marca = subMarcar(0,0,value); break;
	        case 2:marca = subMarcar(0,1,value); break;
	        case 3:marca = subMarcar(0,2,value); break;
	        case 4:marca = subMarcar(1,0,value); break;
	        case 5:marca = subMarcar(1,1,value); break;
	        case 6:marca = subMarcar(1,2,value); break;
	        case 7:marca = subMarcar(2,0,value); break;
	        case 8:marca = subMarcar(2,1,value); break;
	        case 9:marca = subMarcar(2,2,value); break;
		}
		return marca;
	}
	
	//funcion privada que sigue a funcion marcar, esto para no repetir codigo
    //si al marcar en la matriz , existe algun error, coloca la bandera a TRUE
	private String subMarcar(int x, int y, String value)
	{
		String marca = "";
		this.error = false;
		if (this.tablero[x][y].equals("")) //se puede marcar;
		{
			this.tablero[x][y] = value;
			marca = value;
		}
		else //ya esta marcado
		{
			marca = this.tablero[x][y];
			this.error = true; //Error al tratar de marcar casilla que ya esta marcada
		}
		return marca;
	}
	
	public boolean get_error()
    {
        return this.error;
    }

    public String get_turno()
    {
        return (this.turno==1)? "Turno: X":"Turno: O";
    }

    public byte ganador()
    {
        return this.ganador;
    }
    
  //funcion que determina quien gano la partida
    public boolean gano(String matriz[][], String marca)
    {
    	//busqueda de ganador por filas
    	for ( int i = 0 ; i < matriz.length ; i++ )
        {
            byte count=0;
            for ( int j = 0 ; j < matriz.length ; j++)
                count+=( matriz[i][j].equals(marca) )?1:0;
            if( count == 3)
                 return true;
        }
    	//busqueda de ganador por columnar
    	for ( int j = 0 ; j < matriz.length ; j++ )
        {
            byte count=0;
            for ( int i = 0 ; i < matriz.length ; i++)
                count+=( matriz[i][j].equals(marca) )?1:0;
            if( count == 3)
                 return true;
        }
    	//busqueda diagonales
    	if(  matriz[0][0].equals(marca) && matriz[1][1].equals(marca) && matriz[2][2].equals(marca) )
            return true;

        if(  matriz[0][2].equals(marca) && matriz[1][1].equals(marca) && matriz[2][0].equals(marca) )
            return true;

        return false;
    }
    
    //funcion que determina si se puede continuar jugando;
    private boolean empate()
    {
        for ( int i = 0 ; i < tablero.length ; i++ )
           for ( int j = 0 ; j < tablero.length ; j++)
                if( tablero[i][j].equals(""))
                    return false;
        return true;
    }
}















