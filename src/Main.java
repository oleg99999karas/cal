import java.util.Scanner;
public class Main {
    public static Scanner scanner = new Scanner(System.in);

    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Какие числа будете использовать: 1 - арабские, 2 - римские? ");
        int number = scanner.nextInt();
        if (number == 1) {
          Calculate();}
        else {
            if (number==2){
                Calculate2();
            }
            else {
                System.out.println("Ошибка!");
            }
        }

    }

    public static void Calculate() {
        double result = 0;
        System.out.print("Введите operand1: ");
        double operand1 = scanner.nextDouble();
        System.out.print("Введите operand2: ");
        double operand2 = scanner.nextDouble();
        System.out.print("Какое действие выполнить: 1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление? ");
        int operations = scanner.nextInt();

       if (operand2==0)
       {
           System.out.println("Ошибка! На ноль делить нельзя");
       }
       else {
           if (operations == 1) {
               result = operand1 + operand2;
           } else {
               if (operations == 2) {
                   result = operand1 - operand2;
               } else {
                   if (operations == 3) {
                       result = operand1 * operand2;
                   } else {
                       if (operations == 4) {
                           result = operand1 / operand2;
                       }
                   }

               }
           }
       }
        System.out.println("Результат: " + result);
    }
    public static void Calculate2() {
        double result = 0;
        String s = "";
        int operand3 = 0, operand4 = 0;
        System.out.print("Введите operand1: ");
        String operand1 = scanner.next();
        System.out.print("Введите operand2: ");
        String operand2 = scanner.next();
        System.out.println("Какое действие выполнить: 1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление? ");
        int operations = scanner.nextInt();
        String one = new String("I");
        String two = new String("II");
        String three = new String("III");
        String four = new String("IV");
        String five = new String("V");
        String six = new String("VI");
        String seven = new String("VII");
        String eight = new String("VIII");
        String nine = new String("IX");
        String ten = new String("X");
        if (operand1.equals(one)) {
            operand3 = 1;
        } else {
            if (operand1.equals(two)) {
                operand3 = 2;
            } else {
                if (operand1.equals(three)) {
                    operand3 = 3;
                } else {
                    if (operand1.equals(four)) {
                        operand3 = 4;
                    } else {

                        if (operand1.equals(five)) {
                            operand3 = 5;
                        } else {
                            if (operand1.equals(six)) {
                                operand3 = 6;

                            } else {
                                if (operand1.equals(seven)) {
                                    operand3 = 7;

                                } else {
                                    if (operand1.equals(eight)) {
                                        operand3 = 8;

                                    } else {

                                        if (operand1.equals(nine)) {
                                            operand3 = 9;
                                        } else {
                                            if (operand1.equals(ten)) {
                                                operand3 = 10;
                                            } else {
                                                System.out.println("Ошибка!");
                                            }
                                        }

                                    }

                                }

                            }


                        }


                    }


                }


            }
        }
        if (operand2.equals(one)) {
            operand4 = 1;
        } else {
            if (operand2.equals(two)) {
                operand4 = 2;
            } else {
                if (operand2.equals(three)) {
                    operand4 = 3;
                } else {
                    if (operand2.equals(four)) {
                        operand4 = 4;
                    } else {

                        if (operand2.equals(five)) {
                            operand4 = 5;
                        } else {
                            if (operand2.equals(six)) {
                                operand4 = 6;

                            } else {
                                if (operand2.equals(seven)) {
                                    operand4 = 7;

                                } else {
                                    if (operand2.equals(eight)) {
                                        operand3 = 4;

                                    } else {

                                        if (operand2.equals(nine)) {
                                            operand4 = 9;
                                        } else {
                                            if (operand2.equals(ten)) {
                                                operand4 = 10;
                                            } else {
                                                System.out.println("Ошибка!");
                                            }
                                        }

                                    }

                                }

                            }


                        }


                    }


                }


            }
        }


            if (operations == 1) {

                result = operand3 + operand4;
            } else {
                if (operations == 2) {
                    result = operand4 - operand4;
                } else {
                    if (operations == 3) {
                        result = operand3 * operand4;
                    } else {
                        if (operations == 4) {
                            result = operand3 / operand4;
                        }
                    }

                }
            }

        if (result == 1) {
            s = "I";
        } else {
            if (result == 2) {
                s = "II";
            } else {
                if (result == 3) {
                    s = "III";
                } else {
                    if (result == 4) {
                        s = "IV";
                    } else {
                        if (result == 5) {
                            s = "V";
                        } else {
                            if (result == 6) {
                                s = "VI";
                            } else {
                                if (result == 7) {
                                    s = "VII";
                                } else {
                                    if (result == 8) {
                                        s = "VIII";
                                    } else {
                                        if (result == 9) {
                                            s = "IX";
                                        } else {
                                            if (result == 10) {
                                                s = "X";
                                            } else {
                                                if (result == 11) {
                                                    s = "XI";
                                                } else {
                                                    if (result == 12) {
                                                        s = "XII";
                                                    } else {
                                                        if (result == 13) {
                                                            s = "XIII";
                                                        } else {
                                                            if (result == 14) {
                                                                s = "XIV";
                                                            } else {
                                                                if (result == 15) {
                                                                    s = "XV";
                                                                } else {
                                                                    if (result == 16) {
                                                                        s = "XVI";
                                                                    } else {
                                                                        if (result == 17) {
                                                                            s = "XVII";
                                                                        } else {
                                                                            if (result == 18) {
                                                                                s = "XVIII";
                                                                            } else {
                                                                                if (result == 19) {
                                                                                    s = "XIX";
                                                                                } else {
                                                                                    if (result == 20) {
                                                                                        s = "XX";
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("Результат: " + s);
        }
    }
}









