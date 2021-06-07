proceso Ejercicio13
	opc=0
	
	Mientras opc <> 3 Hacer
		Escribir "*** Menú de opciones posibles ***"
		Escribir "1.Sumar"
		Escribir "2.Dividir"
		Escribir "3.Salir"
		Escribir "*** Ingrese el numero de la  opcion a selecionar ***"
		Leer opc
		
		si opc = 1 Entonces
			Escribir "Ingrese el Primer número"
			Leer n1
			Escribir "Ingrese el Segundo numero"
			Leer n2
			sumatoria = n1+n2
			Escribir "La suma es: " sumatoria "."
			Escribir " "
		sino 
			si opc = 2 Entonces
				Escribir "ingrese el Dividendo"
				Leer dividendo
				Escribir "Ingrese el Divisior"
				Leer divisor
				
				si divisor=0 Entonces
					Escribir "No se puede dividir entre 0."
					Escribir " "
				sino
					division = dividendo / divisor
					Escribir "La division dá: " division "."
					Escribir " "
				FinSi
				
			SiNo
				Escribir "*** Algoritmo terminado ***"
			FinSi
		FinSi
	FinMientras
	
FinProceso

