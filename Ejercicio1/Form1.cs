using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Ejercicio1
{
    public partial class Form1 : Form
    {
        double primero;
        double segundo;
        string operador;
        public Form1()
        {
            InitializeComponent();
            txt_main.MaxLength = 20;
        }

        Clases.ClsSuma operacion1 = new Clases.ClsSuma();
        Clases.ClsResta operacion2 = new Clases.ClsResta();
        Clases.ClsMulti operacion3 = new Clases.ClsMulti();
        Clases.ClsDiv operacion4 = new Clases.ClsDiv();
        Clases.ClsPoten operacion5 = new Clases.ClsPoten();
        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            txt_main.Text = txt_main.Text + "4";
        }

        private void button1_Click(object sender, EventArgs e)
        {
            txt_main.Text = txt_main.Text + "1";
        }

        private void button17_Click(object sender, EventArgs e)
        {

        }

        private void button18_Click(object sender, EventArgs e)
        {

        }

        private void button19_Click(object sender, EventArgs e)
        {

        }

        private void button20_Click(object sender, EventArgs e)
        {

        }

        private void button11_Click(object sender, EventArgs e)
        {
            operador = "^";
            primero = double.Parse(txt_main.Text);
            txt_main.Clear();
        }

        private void button12_Click(object sender, EventArgs e)
        {
            operador = "/";
            primero = double.Parse(txt_main.Text);
            txt_main.Clear();
        }

        private void button13_Click(object sender, EventArgs e)
        {
            operador = "*";
            primero = double.Parse(txt_main.Text);
            txt_main.Clear();
        }

        private void button14_Click(object sender, EventArgs e)
        {
            operador = "-";
            primero = double.Parse(txt_main.Text);
            txt_main.Clear();
        }

        private void button15_Click(object sender, EventArgs e)
        {
            operador = "+";
            primero = double.Parse(txt_main.Text);
            txt_main.Clear();
        }

        private void button6_Click(object sender, EventArgs e)
        {
            txt_main.Text = txt_main.Text + "0";
        }

        private void button7_Click(object sender, EventArgs e)
        {
            txt_main.Text = txt_main.Text + "9";
        }

        private void button8_Click(object sender, EventArgs e)
        {
            txt_main.Text = txt_main.Text + "8";
        }

        private void button9_Click(object sender, EventArgs e)
        {
            txt_main.Text = txt_main.Text + "5";
        }

        private void button10_Click(object sender, EventArgs e)
        {
            txt_main.Text = txt_main.Text + "2";
        }

        private void button5_Click(object sender, EventArgs e)
        {
            txt_main.Text = txt_main.Text + "6";
        }

        private void button4_Click(object sender, EventArgs e)
        {
            txt_main.Text = txt_main.Text + "3";
        }

        private void button3_Click(object sender, EventArgs e)
        {
            txt_main.Text = txt_main.Text + "7";
        }

        private void button16_Click(object sender, EventArgs e)
        {

        }

        private void button16_Click_1(object sender, EventArgs e)
        {
            segundo = double.Parse(txt_main.Text);
            double Sum;
            double Res;
            double Mul;
            double Div;
            double Pot;
            switch(operador)
            {
                case "+":
                    Sum = operacion1.Sumar((primero), (segundo));
                    txt_main.Text = Sum.ToString();
                    break;
                case "-":
                    Res = operacion2.Restar((primero), (segundo));
                    txt_main.Text = Res.ToString();
                    break;
                case "*":
                    Mul = operacion3.Multiplicar((primero), (segundo));
                    txt_main.Text = Mul.ToString();
                    break;
                case "/":
                    Div = operacion4.Division((primero), (segundo));
                    txt_main.Text = Div.ToString();
                    break;
                case "^":
                    Pot = operacion5.Potenciar((primero), (segundo));
                    txt_main.Text = Pot.ToString();
                    break;
            }
        }

        private void btn_borrar_Click(object sender, EventArgs e)
        {
            txt_main.Clear();
        }

        private void txt_main_TextChanged(object sender, EventArgs e)
        {
            
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
