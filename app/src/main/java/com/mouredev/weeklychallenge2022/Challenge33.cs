using System;
using System.Globalization;

public class Program
{
	/** He marraneado el array de los elementos, 
	* duplicandolos y poniendole un order a mano, 
	* para evitar tener que hacer calculos que solo entorpecerian mucho la comprensi�n del c�digo dando el mismo resultado.
	* No es la soluci�n que me gustar�a pero quiz�s si la mas 'sencilla'.
	* Se puede hacer uso de la librearia para comprobar resultados etc --> https://docs.microsoft.com/es-es/dotnet/api/system.globalization.chineselunisolarcalendar?view=net-6.0
	*/
	private static string[] celestialTrunks = new string[] { "Agua", "Madera", "Madera", "Fuego", "Fuego", "Tierra", "Tierra", "Metal", "Metal", "Agua" };
	private static string[] earthlyBranches = new string[] { "Cerdo", "Rata", "Buey", "Tigre", "Conejo", "Drag�n", "Serpiente", "Caballo", "Oveja", "Mono", "Gallo", "Perro" };

	public static void Main()
	{
		Console.WriteLine("Introduce un a�o para conocer su s�mbolo sexagesimal.");

		var readedYear = Console.ReadLine();
		var sexagenaryCycleSymbol = GetSexagenaryCycleSymbolBy(readedYear);

		Console.WriteLine(sexagenaryCycleSymbol);


		/**
		Bloque para sacar una lista de simbolos sin tener que insertar a mano los a�os, para pruebas

		var currentYear = 1804;
		for (var i = 0; i < 2500; i++) 
		{
			Console.WriteLine(GetSexagenaryCycleSymbolBy(currentYear.ToString()));

			currentYear++;
		}\
		*/
	}

	private static string GetSexagenaryCycleSymbolBy(string year)
	{
		var resultMessage = "El A�o introducido no es un a�o v�lido";
		int introducedYear;
		var isNumber = int.TryParse(year, out introducedYear);
		if (isNumber == true && introducedYear > 0)
		{
			var sexagenaryYear = ((introducedYear - 4) % 60) + 1;
			var celestialTrunk = celestialTrunks[(sexagenaryYear % 10)];
			var earthlyBranch = earthlyBranches[(sexagenaryYear % 12)];

			resultMessage = string.Format("El signo sexagesimal para el a�o {0} es: {1} - {2}", introducedYear, celestialTrunk, earthlyBranch);
		}

		return resultMessage;
	}
}