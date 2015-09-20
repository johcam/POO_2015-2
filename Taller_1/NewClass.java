//Hecho por Gabriel Martínez
public class NewClass {
    int dinero;
    
public NewClass(int numero){
    this.dinero=numero;
    }
public int billetes_50000(){
    int i=0;
    while(this.dinero>=50000){
        this.dinero=this.dinero-50000;
        i++;
   }
   return i;
}

public int billetes_20000(){
    int i=0;
    while(this.dinero>=20000){
        this.dinero=this.dinero-20000;
        i++;
   }
   return i;
}

public int billetes_10000(){
    int i=0;
    while(this.dinero>=10000){
        this.dinero=this.dinero-10000;
        i++;
   }
   return i;
}

public int billetes_5000(){
    int i=0;
    while(this.dinero>=5000){
        this.dinero=this.dinero-5000;
        i++;
   }
   return i;
}

public int billetes_2000(){
    int i=0;
    while(this.dinero>=2000){
        this.dinero=this.dinero-2000;
        i++;
   }
   return i;
}

public int billetes_1000(){
    int i=0;
    while(this.dinero>=1000){
        this.dinero=this.dinero-1000;
        i++;
   }
   return i;
}

public int monedas_500(){
    int i=0;
    while(this.dinero>=500){
        this.dinero=this.dinero-500;
        i++;
   }
   return i;
}

public int monedas_200(){
    int i=0;
    while(this.dinero>=200){
        this.dinero=this.dinero-200;
        i++;
   }
   return i;
}

public int monedas_100(){
    int i=0;
    while(this.dinero>=100){
        this.dinero=this.dinero-100;
        i++;
   }
   return i;
}

public int monedas_50(){
    int i=0;
    while(this.dinero>=50){
        this.dinero=this.dinero-50;
        i++;
   }
   return i;
}

public int nuevo_dinero(){
    return this.dinero;
}
}