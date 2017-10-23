package Test_Frenzy_Dashboard;

import org.testng.annotations.Test;

public class Variables {
		//Variables
		public String Servicios = "(//P[@href='#Services'][text()='SERVICIOS'][text()='SERVICIOS'])[1]";
		public String SistemaDeBits = "(//A[@href='#menu/bits'][text()='SISTEMA DE BITS'][text()='SISTEMA DE BITS'])[1]";
		public String FlechaAbajo = "//IMG[@src='img/flecha-abajo.png']";
		public String ButtonComprar = "//BUTTON[@class='buttonInBits'][text()='¡Comprar!']";
		public String ButtonCalculaTuCosto = "//BUTTON[@class='buttonInBits'][text()='Calcula tu costo']";
		public String CuponesyPromociones = "(//A[@href='#/menu/coupons_and_promotions'])[1]";
		public String ButtonRegistrateBits = "(//BUTTON[@class='buttonInBits'][text()='¡Regístrate!'][text()='¡Regístrate!'])[1]";
		public String ButtonRegistrateBits2 = "(//BUTTON[@class='buttonInBits'][text()='¡Regístrate!'][text()='¡Regístrate!'])[2]";
		public String SistemadeGibits = "(//A[@href='#/menu/GiBits'])[1]";
		public String ButtonVideo = "//IMG[@src='img/play-video.png']";
		public String FrenzyDash = "http://dev-frenzy-dashboard.s3-website-us-east-1.amazonaws.com/#/menu/home";
		public String IniciarSesion = "(//DIV[@class='selectTabLogin'])[1]";
		public String ModalSesion = "//DIV[@class='modal-content']";
		public String Usuario = "(//INPUT[@type='text'])[1]";
		public String Contraseña = "//INPUT[@type='password']";
		public String ButtonEntrar = "//DIV[@class='redButtonStyle']";
		public String ButtonEmpresa = "//DIV[@class='col-xs-6 col-sm-6 col-md-3 col-lg-3 ng-scope']";
		public String ModalQuestion = "(//DIV[@role='dialog'])[2]";
		public String ButtonDashboard = "//BUTTON[@type='button'][text()='Dashboard']";
		public String ButtonPlus = "//DIV[@class='glyphicon glyphicon-plus frenzyTitleColorText frenzyCircleButton clickCursor ng-scope']";
		public String ButtonNuevoCupon = "(//DIV[@class='bariolBold optionSubMenu clickCursor'])[2]";
		public String InputTitulodelCupon = "(//INPUT[@type='text'])[1]";
		public String InputDescripcion = "(//TEXTAREA[@type='text'])[1]";
		public String InputCodigoCupon = "(//INPUT[@type='text'])[2]";
		public String InputDate = "(//INPUT[@type='date'])[1]";
		public String InputDateFinish = "(//INPUT[@type='date'])[2]";
		public String InputTime = "(//INPUT[@type='time'])[1]";
		public String InputTimeFinish = "(//INPUT[@type='time'])[2]";
		public String CheckTime = "(//DIV[@class='clickCursor'])[1]";
		public String CheckEspecial = "(//DIV[@class='clickCursor'])[3]";
		public String InputTerminosyCondiciones = "(//TEXTAREA[@type='text'])[2]";
		public String ButtonCrear = "//DIV[@class='frenzyButton']";
		public String ButtonPremiosalInstante = "(//DIV[@class='bariolBold optionSubMenu clickCursor'])[4]";
		public String InputNOcodigos = "//SELECT[@class='form-control CategoryApp styleSelectOrInput widthSelectOrInput PackageValue ng-valid ng-not-empty ng-dirty ng-valid-parse ng-touched']";
		public String InputPremios = "(//INPUT[@type='number'])[1]";
		public String InputRedencion = "(//INPUT[@type='number'])[3]";
		public String ButtonSiguiente = "//SPAN[@class='glyphicon glyphicon-chevron-right']";
		public String InputNombrePremio = "//INPUT[@type='text']";
		public String InputDescripcionPromo = "(//TEXTAREA[@type='text'])[1]";
		public String InputPolitica = "(//TEXTAREA[@type='text'])[2]";
		public String InputTerminos = "(//TEXTAREA[@type='text'])[3]";
		public String InputNombre = "//INPUT[@id='awardName']";
		public String InputDescripcion2 = "//INPUT[@id='descriptionAward']";
		public String InputCantidad = "//INPUT[@id='quantityAward']";
		public String ButtonGuardar = "//DIV[@id='saveAwardButton']";
		public String ButtonSI = "(//DIV[@class='redButtonStyle'])[1]";
		public String PromocionCreada = "//DIV[@role='dialog']";
		public String ButtonSalir = "//BUTTON[@type='button'][text()='Salir']";
		public String RowPromocion = "(//TD[@class='blueText ng-binding'][text()='TestPromo1'][text()='TestPromo1'])[1]";
		public String Check1 = "(//DIV[@class='clickCursor'])[1]";
		public String Check2 = "(//DIV[@class='clickCursor'])[2]";
		public String InputPrecioBase = "(//INPUT[@type='number'])[2]";
		public String PorcentDesc = "//INPUT[@type='number']";
		public String RowCupon = "//TD[@class='ng-binding'][text()='Compra Cualquier Producto Seleccionad0']";
		public String Ckeck3 = "(//DIV[@class='clickCursor'])[3]";
		public String InputCategoria = "//SELECT[@class='form-control CategoryApp ng-valid ng-touched ng-not-empty ng-dirty ng-valid-parse']";
		public String InputNombreUS = "(//INPUT[@type='text'])[3]";
		public String InputNumero = "//INPUT[@type='number']";
		public String ButtonAgregar = "//DIV[@class='redButtonStyle updateCenter']";
		public String InputNit = "(//INPUT[@type='text'])[4]";
		public String InputRazonSocial = "(//INPUT[@type='text'])[5]";
		public String InputTelOficina = "(//INPUT[@type='text'])[6]";
		public String InputEncargadoFin = "(//INPUT[@type='text'])[7]";
		public String InputCorreoFin = "(//INPUT[@type='text'])[8]";
		public String InputEncarMercadeo = "(//INPUT[@type='text'])[9]";
		public String CorreoMercadeo = "(//INPUT[@type='text'])[10]";
		public String InstantAward = "//TD[@class='ng-binding'][text()='Productos Gratis']";
		public String ButtonModificar = "(//DIV[@class='redButtonStyle'])[2]";
		public String ModalInstantAward = "//DIV[@class='modal-content borderPublicationPoints']";
		public String RowTarjeta = "//TD[@class='ng-binding'][text()='prueba']";
		public String ModalTarjeta = "//DIV[@class='modal-content borderPublicationDirectAward']";
		public String NombreTarjeta = "//INPUT[@type='text']";
		public String btn = "//DIV[@class='glyphicon glyphicon-plus frenzyTitleColorText frenzyCircleButton clickCursor ng-scope']";
		public String btnpromo = "(//DIV[@class='bariolBold optionSubMenu clickCursor'])[1]";
		public String tpromo = "(//INPUT[@type='text'])[1]";
		public String dpromo = "(//TEXTAREA[@type='text'])[1]";
		public String url = "(//INPUT[@type='text'])[2]";
		public String fpub = "(//INPUT[@type='date'])[1]";
		public	String ff = "(//INPUT[@type='date'])[2]";
		public String hpub = "(//INPUT[@type='time'])[1]";
		public String hf = "(//INPUT[@type='time'])[2]";
		public String tyc = "(//TEXTAREA[@type='text'])[2]";
		public String crear = "//DIV[@class='frenzyButton']";
		public String ButtonRegistrate = "(//P[@class='buttonMenu'][text()='REGÍSTRATE'][text()='REGÍSTRATE'])[1]";
		public String ModalRegistrate = "//DIV[@class='modal-content']";
		public String InpCorreo = "(//INPUT[@type='text'])[1]";
		public String InpNombre = "(//INPUT[@type='text'])[2]";
		public String InpApellid = "(//INPUT[@type='text'])[3]";
		public String InpPassword = "//INPUT[@type='password']";
		public String BtnCrear = "//DIV[@class='redButtonStyle']";
		public String AlertCuenta = "(//DIV[@role='dialog'])[2]";
		public String BtnSalir = "//BUTTON[@type='button'][text()='Salir']";
		public String btnlealtad = "(//DIV[@class='bariolBold optionSubMenu clickCursor'])[3]";
		public String namet = "//INPUT[@type='text']";
		public String pol = "(//TEXTAREA[@type='text'])[2]";
		public String next = "//DIV[@class='clickCursor']";

  @Test
  public void f() {
	  
  }
}
