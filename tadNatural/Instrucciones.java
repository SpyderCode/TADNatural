/*Implemente el TAD Natural con los constructores Cero y Asignar y las operaciones Sucesor, Escero, Igual, Suma, Antecesor, Diferencia, Producto, Menor Divisi�nentera, M�dulo.
Representaci�n Informal
Si los constructores son Cero  hay que expresar todas las operaciones en funci�n de ellas. Usaremos error para indicar las excepciones. Adem�s, como no hay ambiguedad en la expresi�n de los elementos no es necesario indicar ecuaciones entre los constructores.
El significado de las operaciones es:
�	Cero. Da el numero natural 0.
�	Asigna. Asigna un valor positivo al n�mero natural.
�	El Sucesor de un n�mero natural es el natural que le sigue en su orden. El sucesor de 2 es el 3.
�	El Antecesor den. El antecesor un n�mero natural es el natural que le precede en el orden. El antecesor del 5 es 4.
�	Suma. Realiza la suma de dos Naturales (2+3=5).
�	Diferencia. Da la diferencia de dos Naturales (3-2=1).
�	Producto. Da el producto de dos Naturales (2*3=6).
�	Escero. Nos indica si un natural es el numero cero.
�	Igual. Nos indica si dos naturales son iguales.
�	Divisi�nEntera. Nos dala divisi�n entera entre dos naturales. Division entera de 7/3=2
�	M�dulo. Nos da el resto o residuo de la divisi�n entre 2 numeros naturales. Modulo(7,3)=1.
Representaci�n Formal
TAD Natural (Valores: n�meros enteros positivos con el cero; Operaciones: Cero, Sucesor, Escero, Igual, Suma, Antecesor, Diferencia, Producto, Menor, Divisi�nentera, M�dulo)
Sintaxis:
�	//*Cero  ->Natural
�	//*Asigna(Natural)->Natural
�	//Sucesor(Natural)->Natural
�	//Escero(Natural)->Boolean
�	//Igual(Natural,Natural)->Boolean
�	//Suma(Natural,Natural)->Natural
�	//Antecesor(Natural)->Natural
�	//Diferencia(Natural,Natural)->Natural
�	//Producto(Natural,Natural)->Natural
�	//Menor(Natural,Natural)->boolean
�	//Divisi�nentera(Natural,Natural)->Natural
�	//M�dulo(Natural,Natural)->Natural
Sem�ntica: para todo m,n de tipo natural
�	EsCero(Cero) =>True
�	EsCero(Sucesor(n))=>False
�	Igual(Cero,n)=>EsCero(n)
�	Igual(Sucesor(n),Cero)=>False
�	Igual(Sucesor(n),Sucesor(m))=>Igual(n,m)
�	Suma(Cero,n)=>n
�	Suma(Sucesor(m),n)=>Sucesor(Suma(m,n))
�	Antecesor(Cero)=>error
�	Antecesor(Sucesor(n))=>n
�	Diferencia(n,Cero)=>n
�	Diferencia(Cero,Sucesor(n))=>Error
�	Diferencia(Sucesor(m),Sucesor(n))=>Diferencia(m,n)
�	Producto(n,Cero)=>Cero
�	Producto(n,Sucesor(m))=>Suma(n,Producto(n,m))
�	Menor(n,Cero)=>True
�	Menor(Cero,Sucesor(n))=>False
�	Menor(Sucesor(m),Sucesor(n))=>Menor(m,n)
�	Divisi�nentera(n,Cero)=>Error
�	Divisi�nentera(m,Sucesor(n))=>Si Menor (m,Sucesor(n)) entonces Cero sino Sucesor(Divisi�nEntera(Diferencia(m,Sucesor(n)),Sucesor(n)))
�	Modulo(m,Cero)=>Error
�	Modulo(m,Sucesor(n))=>si Menor(m,Sucesor(n)) entonces m sino Modulo(Diferencia(m,Sucesor(n)),Sucesor(n))
*/