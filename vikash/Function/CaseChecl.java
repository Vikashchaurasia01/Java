����   > @
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	 
    out Ljava/io/PrintStream;  Enter any Letter: 
      java/io/PrintStream println (Ljava/lang/String;)V
     ! next ()Ljava/lang/String;
 # $ % & ! java/lang/String trim
 # ( ) * charAt (I)C , 
lower case . 
Upper case 0 com/vikash/CaseChecl Code LineNumberTable LocalVariableTable this Lcom/vikash/CaseChecl; main ([Ljava/lang/String;)V args [Ljava/lang/String; Ljava/util/Scanner; ch C StackMapTable 
SourceFile CaseChecl.java ! /           1   /     *� �    2        3        4 5   	 6 7  1   �     ?� Y� 	� L� � +� � "� '=a� z� � +� � � -� �    2           	   +  6  >  3        ? 8 9    4  :     ; <  =   
 � 6   >    ?