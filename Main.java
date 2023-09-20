package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.geometry.*;
import javafx.event.*;
import javafx.scene.image.ImageView;










public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		MediaRentalManger mr=new MediaRentalManger();
		
		GridPane root = new GridPane();
		primaryStage.setMaximized(true);
		VBox vb=new VBox(20);
		vb.setPadding(new Insets(30,50,50,30));
		Image image1=new Image("https://img.icons8.com/external-parzival-1997-outline-color-parzival-1997/344/external-customer-shopstreaming-parzival-1997-outline-color-parzival-1997.png");
	    ImageView imagevi1=new ImageView();
	    imagevi1.setImage(image1);
	    imagevi1.setFitWidth(50);
	    imagevi1.setFitHeight(50);
	    
	    
	    Image image2=new Image("https://img.icons8.com/external-prettycons-lineal-color-prettycons/344/external-social-media-user-interface-vol-3-prettycons-lineal-color-prettycons.png");
	    ImageView imagevi2=new ImageView();
	    imagevi2.setImage(image2);
	    imagevi2.setFitWidth(50);
	    imagevi2.setFitHeight(50);
	    
	    Image image3=new Image("https://img.icons8.com/external-inipagistudio-mixed-inipagistudio/344/external-rent-moving-house-inipagistudio-mixed-inipagistudio.png");
	    ImageView imagevi3=new ImageView();
	    imagevi3.setImage(image3);
	    imagevi3.setFitWidth(50);
	    imagevi3.setFitHeight(50);
	    
	   Image image4=new Image("https://img.icons8.com/external-victoruler-flat-victoruler/344/external-shop-business-and-finance-victoruler-flat-victoruler.png");
	    ImageView imagevi4=new ImageView();
	    imagevi4.setImage(image4);
	    imagevi4.setFitWidth(600);
	    imagevi4.setFitHeight(600);
	    
		Button x1=new Button("customer",imagevi1);
		Button x2=new Button("Media",imagevi2);
		Button x3=new Button("Rent",imagevi3);
		
		x1.setStyle("-fx-background-color:dodgerblue;-fx-background-radius:10px");
		x2.setStyle("-fx-background-color:dodgerblue;-fx-background-radius:10px");
		x3.setStyle("-fx-background-color:dodgerblue;-fx-background-radius:10px");
	
		x1.setPrefSize(450, 150);
		x2.setPrefSize(450, 150);
		x3.setPrefSize(450, 150);
		vb.getChildren().addAll(x1,x2,x3);
		
		
		Label lb = new Label("Rental Media System");
		lb.setPrefSize(200,70);
	    lb.setTranslateX(50);
	    lb.setTranslateY(5);
	    lb.setStyle("-fx-border-color:blue");
	    
	    root.add(imagevi4,16,1);
        root.add(lb,16,2);
        root.add(vb,1,1);
        
        Scene scene = new Scene(root, 400,600);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Project");
		primaryStage.show();
	    //----------------------------------------------------------------------------------------------------------//

	    x1.setOnAction(e1->{
	    	
                   Stage s1=new Stage();
				   GridPane root1 = new GridPane();
				   root1.setPadding(new Insets(20,20,20,20));
				   root1.setAlignment(Pos.CENTER);
				   root1.setVgap(20);
				   root1.setHgap(20);
				   Button a1=new Button("Add new Customer");
				   Button a2=new Button("Delete Customer");
				   Button a3=new Button("Update Information about Customer");
				   Button a4=new Button("Search a Customer by id");
				   Button a5=new Button("Return to main page");

				   a1.setStyle("-fx-background-color:dodgerblue;-fx-background-radius:10px");
				   a2.setStyle("-fx-background-color:dodgerblue;-fx-background-radius:10px");
				   a3.setStyle("-fx-background-color:dodgerblue;-fx-background-radius:10px");
				   a4.setStyle("-fx-background-color:dodgerblue;-fx-background-radius:10px");
				   a5.setStyle("-fx-background-color:dodgerblue;-fx-background-radius:10px");
					
				    a1.setPrefSize(250, 50);
					a2.setPrefSize(250, 50);
					a3.setPrefSize(250, 50);
					a4.setPrefSize(250, 50);
					a5.setPrefSize(250, 50);
										
				   root1.add(a1, 2, 0);
				   root1.add(a2, 2, 1);
				   root1.add(a3, 2, 2);
				   root1.add(a4, 2, 3);
				   root1.add(a5, 2, 4);

				   Scene scene1=new Scene(root1,500,500);
				   s1.setScene(scene1);
				   s1.setTitle("Customer Window");
				   s1.show();

	  ///////////////////////////////////////////////////////////////////////////////////
				    a1.setOnAction(e2->{
				    	
		                   Stage s2=new Stage();
				    	   GridPane root2 = new GridPane();
						   root2.setPadding(new Insets(50,50,50,50));
						   root2.setVgap(50);
						   root2.setHgap(50);
						   
						    Label customerId1 = new Label("Customer ID:");
							TextField customerIdTex1 = new TextField();
							
							Label customerName1 = new Label("Customer Name:");
							TextField customerNameTex1 = new TextField();
							customerNameTex1.setDisable(true);
							customerIdTex1.setOnKeyTyped(j->{
								customerNameTex1.setDisable(false);
							});
							
							Label customerAddress1 = new Label("Customer Address:");
							TextField customerAddressTex1 = new TextField();
							customerAddressTex1.setDisable(true);
							customerNameTex1.setOnKeyTyped(j->{
								customerAddressTex1.setDisable(false);
							});
							
							ToggleGroup tg  = new ToggleGroup();
							RadioButton tgb1 = new RadioButton("Limited");
							RadioButton tgb2 = new RadioButton("UNLimited");

							tgb1.setToggleGroup(tg);
							tgb2.setToggleGroup(tg);

							Label customerPlan1 = new Label("Plan:");

							
							
							Label customerMobile1 = new Label("Customer Mobile:");
							TextField customerMobileTex1 = new TextField();
							customerMobileTex1.setDisable(true);
							customerAddressTex1.setOnKeyTyped(j->{
								customerMobileTex1.setDisable(false);
							});

							root2.addRow(0, customerId1, customerIdTex1);
							root2.addRow(1, customerName1, customerNameTex1);
							root2.addRow(2, customerAddress1, customerAddressTex1);
							root2.addRow(3, customerMobile1, customerMobileTex1);
							root2.addRow(4,customerPlan1, tgb1, tgb2);

				    	
							Image image21=new Image("https://img.icons8.com/cute-clipart/344/add.png");
						    ImageView imagevi21=new ImageView();
						    imagevi21.setImage(image21);
						    imagevi21.setFitWidth(15);
						    imagevi21.setFitHeight(15);		
						    Button add1=new Button("add",imagevi21);
							add1.setPrefSize(70,50);
							root2.add(add1, 0,5);
							
							add1.setOnAction(d0->{
						
								
								RadioButton r1=(RadioButton)tg.getSelectedToggle();
								String r9=r1.getText();
								mr.addCustomer(customerIdTex1.getText(), customerMobileTex1.getText(), customerNameTex1.getText(), customerAddressTex1.getText(),r9);
							});
							
							Image image22=new Image("https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
						    ImageView imagevi22=new ImageView();
						    imagevi22.setImage(image22);
						    imagevi22.setFitWidth(15);
						    imagevi22.setFitHeight(15);		
						    Button back1=new Button("back",imagevi22);
						    back1.setPrefSize(70,50);
							root2.add(back1, 1,5);
						    
							
						    Scene scene2=new Scene(root2,550,500);
						    s2.setScene(scene2);
							s2.setTitle("Add new Customer");
							s2.show();
							
							back1.setOnAction(b1->{
								s2.close();
							});
							
				    });
		 ///////////////////////////////////////////////////////////////////////////////////

				    a2.setOnAction(e3->{
				    	
		                   Stage s3=new Stage();
				    	   GridPane root3 = new GridPane();
						   root3.setPadding(new Insets(50,50,50,50));
						   root3.setVgap(30);
						   root3.setHgap(30);
						   
						    Label customerId2 = new Label("Customer ID:");
							TextField customerIdTex2 = new TextField();
							Label customerName2 = new Label("Customer Name:");
							TextField customerNameTex2 = new TextField();
							Label customerAddress2 = new Label("Customer Address:");
							TextField customerAddressTex2 = new TextField();
							Label customerMobile2 = new Label("Customer Mobile:");
							TextField customerMobileTex2 = new TextField();
						   
							ToggleGroup tg  = new ToggleGroup();
							RadioButton tgb1 = new RadioButton("Limited");
							RadioButton tgb2 = new RadioButton("UNLimited");

							tgb1.setToggleGroup(tg);
							tgb2.setToggleGroup(tg);

							Label customerPlan1 = new Label("Plan:");
							
							root3.addRow(0, customerId2, customerIdTex2);
							root3.addRow(1, customerName2, customerNameTex2);
							root3.addRow(2, customerAddress2, customerAddressTex2);
							root3.addRow(3, customerMobile2, customerMobileTex2);
				    	
							Image image31=new Image("https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-delete-multimedia-kiranshastry-gradient-kiranshastry.png");
						    ImageView imagevi31=new ImageView();
						    imagevi31.setImage(image31);
						    imagevi31.setFitWidth(15);
						    imagevi31.setFitHeight(15);		
						    Button Delete1=new Button("Delete",imagevi31);
						    Delete1.setPrefSize(70,30);
							root3.add(Delete1,1,4);
							
							Delete1.setOnAction(d1->{
								
								for(int i=0;i<mr.getCustomerData().size();i++) {
									if(mr.getCustomerData().get(i).getID().equals(customerIdTex2.getText())) {
										mr.getCustomerData().remove(mr.getCustomerData().get(i));

							       }
									
								}
								
							});
										
							Image image32=new Image("https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
						    ImageView imagevi32=new ImageView();
						    imagevi32.setImage(image32);
						    imagevi32.setFitWidth(15);
						    imagevi32.setFitHeight(15);		
						    Button back2=new Button("back",imagevi32);
						    back2.setPrefSize(70,30);
							root3.add(back2, 2,4);
							
							Image image33=new Image("https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
						    ImageView imagevi33=new ImageView();
						    imagevi33.setImage(image33);
						    imagevi33.setFitWidth(15);
						    imagevi33.setFitHeight(15);		
						    Button find1=new Button("find",imagevi33);
						    find1.setPrefSize(70,30);
							root3.add(find1, 0,4);
						    
							find1.setOnAction(d2->{

								for(int i=0;i<mr.getCustomerData().size();i++) {
									if(mr.getCustomerData().get(i).getID().equalsIgnoreCase(customerIdTex2.getText())) {
										customerNameTex2.setText(mr.getCustomerData().get(i).getNameCustomer());	
										customerAddressTex2.setText(mr.getCustomerData().get(i).getAddress());
										customerMobileTex2.setText(mr.getCustomerData().get(i).getMobileNumber());


									}
								}
							});
							
							
						    Scene scene3=new Scene(root3,500,450);
						    s3.setScene(scene3);
							s3.setTitle("Delete a Customer");
							s3.show();
							
							back2.setOnAction(b1->{
								s3.close();
							});
							
				    });
				    
			  ///////////////////////////////////////////////////////////////////////////////////

				   a3.setOnAction(e3->{
					   
				   
					   Stage s4=new Stage();
			    	   GridPane root4 = new GridPane();
					   root4.setPadding(new Insets(50,50,50,50));
					   root4.setVgap(30);
					   root4.setHgap(30);
					   
					    Label customerId3 = new Label("Customer ID:");
						TextField customerIdTex3 = new TextField();
						Label customerName3= new Label("Customer Name:");
						TextField customerNameTex3 = new TextField();
						Label customerAddress3 = new Label("Customer Address:");
						TextField customerAddressTex3 = new TextField();
						Label customerMobile3 = new Label("Customer Mobile:");
						TextField customerMobileTex3 = new TextField();
					   
						root4.addRow(0, customerId3, customerIdTex3);
						root4.addRow(1, customerName3, customerNameTex3);
						root4.addRow(2, customerAddress3, customerAddressTex3);
						root4.addRow(3, customerMobile3, customerMobileTex3);
			    	
						Image image41=new Image("https://img.icons8.com/cotton/344/loop.png");
					    ImageView imagevi41=new ImageView();
					    imagevi41.setImage(image41);
					    imagevi41.setFitWidth(15);
					    imagevi41.setFitHeight(15);		
					    Button Update=new Button("Update",imagevi41);
					    Update.setPrefSize(80,40);
						root4.add(Update,0,4);
						
						Update.setOnAction(d3->{
							
							for(int i=0;i<mr.getCustomerData().size();i++) {
								if(mr.getCustomerData().get(i).getID().equalsIgnoreCase(customerIdTex3.getText())) {
									
									mr.getCustomerData().get(i).setNameCustomer(customerNameTex3.getText());
									mr.getCustomerData().get(i).setAddress(customerAddressTex3.getText());
									mr.getCustomerData().get(i).setMobileNumber(customerMobileTex3.getText());

									

							      	}
								}
							
						});
						
						Image image42=new Image("https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
					    ImageView imagevi42=new ImageView();
					    imagevi42.setImage(image42);
					    imagevi42.setFitWidth(15);
					    imagevi42.setFitHeight(15);		
					    Button back3=new Button("back",imagevi42);
					    back3.setPrefSize(80,40);
						root4.add(back3, 1,4);
					    
						
					    Scene scene4=new Scene(root4,500,450);
					    s4.setScene(scene4);
						s4.setTitle("Update Information about Customer");
						s4.show();
						
						back3.setOnAction(b2->{
							s4.close();
						});
				   
				   });    
		 ///////////////////////////////////////////////////////////////////////////////////

				   a4.setOnAction(e4->{
					   
					   
					   Stage s5=new Stage();
			    	   GridPane root5 = new GridPane();
					   root5.setPadding(new Insets(50,50,50,50));
					   root5.setVgap(30);
					   root5.setHgap(30);
					   
					    Label customerId4= new Label("Customer ID:");
						TextField customerIdTex4 = new TextField();
						Label customerName4= new Label("Customer Name:");
						TextField customerNameTex4 = new TextField();
						Label customerAddress4 = new Label("Customer Address:");
						TextField customerAddressTex4 = new TextField();
						Label customerMobile4 = new Label("Customer Mobile:");
						TextField customerMobileTex4 = new TextField();
					   
						root5.addRow(0, customerId4, customerIdTex4);
						root5.addRow(1, customerName4, customerNameTex4);
						root5.addRow(2, customerAddress4, customerAddressTex4);
						root5.addRow(3, customerMobile4, customerMobileTex4);
			    	
						Image image51=new Image("https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-search-alignment-and-tools-kiranshastry-gradient-kiranshastry.png");
					    ImageView imagevi51=new ImageView();
					    imagevi51.setImage(image51);
					    imagevi51.setFitWidth(15);
					    imagevi51.setFitHeight(15);		
					    Button Search=new Button("Search",imagevi51);
					    Search.setPrefSize(80,40);
						root5.add(Search,0,4);
						
						Search.setOnAction(d9->{
							for(int i=0;i<mr.getCustomerData().size();i++) {
								if(mr.getCustomerData().get(i).getID().equalsIgnoreCase(customerIdTex4.getText())) {
									
									customerNameTex4.setText(mr.getCustomerData().get(i).getNameCustomer());	
									customerAddressTex4.setText(mr.getCustomerData().get(i).getAddress());
									customerMobileTex4.setText(mr.getCustomerData().get(i).getMobileNumber());
								}
							}
						});
						
						Image image52=new Image("https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
					    ImageView imagevi52=new ImageView();
					    imagevi52.setImage(image52);
					    imagevi52.setFitWidth(15);
					    imagevi52.setFitHeight(15);		
					    Button back4=new Button("back",imagevi52);
					    back4.setPrefSize(80,40);
						root5.add(back4, 1,4);
						
						
					    Scene scene5=new Scene(root5,500,450);
					    s5.setScene(scene5);
						s5.setTitle("Search a Customer by id");
						s5.show();
						
						back4.setOnAction(b3->{
							s5.close();
						});
				   });    
				   
		///////////////////////////////////////////////////////////////////////////////////

				   a5.setOnAction(e5->{
					   s1.close();
				   });
			});     
	    
	    //----------------------------------------------------------------------------------------------------------//
	    
	    x2.setOnAction(h1->{
	    	
	    	Stage sm1=new Stage();
			   GridPane rootm1 = new GridPane();
			   rootm1.setPadding(new Insets(20,20,20,20));
			   rootm1.setAlignment(Pos.CENTER);
			   rootm1.setVgap(20);
			   rootm1.setHgap(20);
			   
			   Button m1=new Button("Add new Media");
			   Button m2=new Button("Delete Media");
			   Button m3=new Button("Update Information about Media");
			   Button m4=new Button("Search a Media by code");
			   Button m5=new Button("Print All Media information");
			   Button m6=new Button("Return to main page");

			   m1.setStyle("-fx-background-color:dodgerblue;-fx-background-radius:10px");
			   m2.setStyle("-fx-background-color:dodgerblue;-fx-background-radius:10px");
			   m3.setStyle("-fx-background-color:dodgerblue;-fx-background-radius:10px");
			   m4.setStyle("-fx-background-color:dodgerblue;-fx-background-radius:10px");
			   m5.setStyle("-fx-background-color:dodgerblue;-fx-background-radius:10px");
			   m6.setStyle("-fx-background-color:dodgerblue;-fx-background-radius:10px");

			    m1.setPrefSize(250, 50);
				m2.setPrefSize(250, 50);
				m3.setPrefSize(250, 50);
				m4.setPrefSize(250, 50);
				m5.setPrefSize(250, 50);
			    m6.setPrefSize(250, 50);
				
			   rootm1.add(m1, 2, 0);
			   rootm1.add(m2, 2, 1);
			   rootm1.add(m3, 2, 2);
			   rootm1.add(m4, 2, 3);
			   rootm1.add(m5, 2, 4);
			   rootm1.add(m6, 2, 5);

			   Scene scenem1=new Scene(rootm1,500,500);
			   sm1.setScene(scenem1);
			   sm1.setTitle("Media Window page");
			   sm1.show();

		    	///////////////////////////////////////////////////////////////////////////////////////////////////////////////

	    	m1.setOnAction(h2->{ 
	    		
	    		   Stage stageMedia1=new Stage();
	    		   GridPane m11 = new GridPane();
		 		   m11.setPadding(new Insets(20,20,20,20));
		 		   m11.setAlignment(Pos.CENTER);
		 		   m11.setVgap(20);
		 		   m11.setHgap(20); 
		 		   
	    		Label l1=new Label("select type of media:"); 
	    		ComboBox<String>  comboBox1=new ComboBox<>();
	    		comboBox1.setStyle("-fx-background-color:dodgerblue;-fx-background-radius:10px");
	    		
	    		comboBox1.getItems().add("Game");
	    		comboBox1.getItems().add("Movie");
	    		comboBox1.getItems().add("Album");

	    		m11.add(l1,2,0);
	    		m11.add(comboBox1,2,1);

	    		Image imageMovieBack99=new Image("https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			    ImageView imageMovieBackvi99=new ImageView();
			    imageMovieBackvi99.setImage(imageMovieBack99);
			    imageMovieBackvi99.setFitWidth(15);
			    imageMovieBackvi99.setFitHeight(15);		
			    Button backM99=new Button("back",imageMovieBackvi99);
			    backM99.setPrefSize(70,35);
			    m11.add(backM99, 2,3);
			    
			    backM99.setOnAction(h6->{
			    	stageMedia1.close();
			    });
			    
	    		Scene sceneMedia1=new Scene(m11,500,500);
		      	stageMedia1.setScene(sceneMedia1);
		    	stageMedia1.show();
	    		
		    	
		    	
		    	comboBox1.setOnAction(o->{
		    		if(comboBox1.getValue().equals("Game")) {
		    			
		    			Stage gameStage1=new Stage();
				    	   GridPane gamepane1 = new GridPane();
				    	   gamepane1.setPadding(new Insets(50,50,50,50));
				    	   gamepane1.setVgap(30);
				    	   gamepane1.setHgap(30);
						   
						    Label code1= new Label("Code:");
							TextField codeTex1 = new TextField();
							Label title1= new Label("Title:");
							TextField titleTex1 = new TextField();
							Label numOfCopies1 = new Label("Number of copies:");
							TextField numOfCopiesTex1 = new TextField();
							Label weight1 = new Label("Weight:");
							TextField weightTex1 = new TextField();
						   
							gamepane1.addRow(0, code1, codeTex1);
							gamepane1.addRow(1, title1, titleTex1);
							gamepane1.addRow(2, numOfCopies1, numOfCopiesTex1);
							gamepane1.addRow(3, weight1, weightTex1);
				    	
							Image imageGameadd1=new Image("https://img.icons8.com/cute-clipart/344/add.png");
						    ImageView imageGameaddvi1=new ImageView();
						    imageGameaddvi1.setImage(imageGameadd1);
						    imageGameaddvi1.setFitWidth(15);
						    imageGameaddvi1.setFitHeight(15);		
						    Button addGame1=new Button("add",imageGameaddvi1);
						    addGame1.setPrefSize(80,40);
						    gamepane1.add(addGame1,0,4);
						    
						    addGame1.setOnAction(g0->{
						    	
						    	mr.addGame(codeTex1.getText(),titleTex1.getText(),Integer.parseInt(numOfCopiesTex1.getText()), Double.parseDouble(weightTex1.getText()));
						    });
						    
						    
							
							Image imageGameBack1=new Image("https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
						    ImageView imageGameBackvi1=new ImageView();
						    imageGameBackvi1.setImage(imageGameBack1);
						    imageGameBackvi1.setFitWidth(15);
						    imageGameBackvi1.setFitHeight(15);		
						    Button backG1=new Button("back",imageGameBackvi1);
						    backG1.setPrefSize(80,40);
						    gamepane1.add(backG1, 1,4);
							
						    backG1.setOnAction(h4->{
						    	gameStage1.close();
						    });
							
						    Scene sceneGame1=new Scene(gamepane1,500,450);
						    gameStage1.setScene(sceneGame1);
						    gameStage1.setTitle("Add Game");
						    gameStage1.show();
			    		
		    		}
		    		else if(comboBox1.getValue().equals("Movie")) {
		    			
		    			 Stage  movieStage1=new Stage();
				    	   GridPane moviepane1 = new GridPane();
				    	   moviepane1.setPadding(new Insets(50,50,50,50));
				    	   moviepane1.setVgap(30);
				    	   moviepane1.setHgap(30);
						   
						    Label codeM1= new Label("Code:");
							TextField codeMTex1 = new TextField();
							Label titleM1= new Label("Title:");
							TextField titleMTex1 = new TextField();
							Label numOfCopiesM1 = new Label("Number of copies:");
							TextField numOfCopiesMTex1 = new TextField();
							Label rating1 = new Label("Rating:");
							TextField ratingTex1 = new TextField();
						   
							moviepane1.addRow(0, codeM1, codeMTex1);
							moviepane1.addRow(1, titleM1, titleMTex1);
							moviepane1.addRow(2, numOfCopiesM1, numOfCopiesMTex1);
							moviepane1.addRow(3, rating1, ratingTex1);
				    	
							Image imageMovieadd1=new Image("https://img.icons8.com/cute-clipart/344/add.png");
						    ImageView imageMovieaddvi1=new ImageView();
						    imageMovieaddvi1.setImage(imageMovieadd1);
						    imageMovieaddvi1.setFitWidth(15);
						    imageMovieaddvi1.setFitHeight(15);		
						    Button addMovie1=new Button("add",imageMovieaddvi1);
						    addMovie1.setPrefSize(80,40);
						    moviepane1.add(addMovie1,0,4);
							
						    addMovie1.setOnAction(g1->{
						    	mr.addMovie(codeMTex1.getText(), titleMTex1.getText(), Integer.parseInt(numOfCopiesMTex1.getText()), ratingTex1.getText());
						    });
						    
							Image imageMovieBack1=new Image("https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
						    ImageView imageMovieBackvi1=new ImageView();
						    imageMovieBackvi1.setImage(imageMovieBack1);
						    imageMovieBackvi1.setFitWidth(15);
						    imageMovieBackvi1.setFitHeight(15);		
						    Button backM1=new Button("back",imageMovieBackvi1);
						    backM1.setPrefSize(80,40);
						    moviepane1.add(backM1, 1,4);
						    
						    backM1.setOnAction(h6->{
						    	movieStage1.close();
						    });
							
						    Scene sceneMovie1=new Scene(moviepane1,500,450);
						    movieStage1.setScene(sceneMovie1);
						    movieStage1.setTitle("Add movie");
						    movieStage1.show();
		    			
						    
		    		}
		    		else if(comboBox1.getValue().equals("Album")) {
		    			   
			    	       Stage  albumStage1=new Stage();
				    	   GridPane albumpane1 = new GridPane();
				    	   albumpane1.setPadding(new Insets(50,50,50,50));
				    	   albumpane1.setVgap(30);
				    	   albumpane1.setHgap(30);
						   
						    Label codeA1= new Label("Code:");
							TextField codeATex1 = new TextField();
							Label titleA1= new Label("Title:");
							TextField titleATex1 = new TextField();
							Label numOfCopiesA1 = new Label("Number of copies:");
							TextField numOfCopiesATex1 = new TextField();
							Label artist1 = new Label("Artist:");
							TextField artistTex1 = new TextField();
							Label songs1 = new Label("Songs:");
							TextField songsTex1 = new TextField();
						   
							albumpane1.addRow(0, codeA1, codeATex1);
							albumpane1.addRow(1, titleA1, titleATex1);
							albumpane1.addRow(2, numOfCopiesA1, numOfCopiesATex1);
							albumpane1.addRow(3, artist1, artistTex1);
							albumpane1.addRow(4, songs1, songsTex1);

				    	
							Image imageAlbumeadd1=new Image("https://img.icons8.com/cute-clipart/344/add.png");
						    ImageView imageAlbumeaddvi1=new ImageView();
						    imageAlbumeaddvi1.setImage(imageAlbumeadd1);
						    imageAlbumeaddvi1.setFitWidth(15);
						    imageAlbumeaddvi1.setFitHeight(15);		
						    Button addAlbum1=new Button("add",imageAlbumeaddvi1);
						    addAlbum1.setPrefSize(80,40);
						    albumpane1.add(addAlbum1,0,5);
							
						    addAlbum1.setOnAction(g1->{
						    	
						    	mr.addAlbum(codeATex1.getText(), titleATex1.getText(), Integer.parseInt(numOfCopiesATex1.getText()), artistTex1.getText(),songsTex1.getText());
						    });
						    
							Image imageAlbumeBack1=new Image("https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
						    ImageView imageAlbumeBackvi1=new ImageView();
						    imageAlbumeBackvi1.setImage(imageAlbumeBack1);
						    imageAlbumeBackvi1.setFitWidth(15);
						    imageAlbumeBackvi1.setFitHeight(15);		
						    Button backA1=new Button("back",imageAlbumeBackvi1);
						    backA1.setPrefSize(80,40);
						    albumpane1.add(backA1, 1,5);
						    
						    backA1.setOnAction(h8->{
						    	albumStage1.close();
						    });
							
						    Scene sceneAlbum1=new Scene(albumpane1,500,450);
						    albumStage1.setScene(sceneAlbum1);
						    albumStage1.setTitle("Add album");
						    albumStage1.show();
			    		
		    			
		    			
		    		}

		    		
		    	});
	    		
	    	});
	    	///////////////////////////////////////////////////////////////////////////////////////////////////////////////

	    	m2.setOnAction(k1->{
	    		
	    		
	    		
	    		
	    		 Stage gameStage2=new Stage();
		    	   GridPane gamepane2 = new GridPane();
		    	   gamepane2.setPadding(new Insets(50,50,50,50));
		    	   gamepane2.setVgap(30);
		    	   gamepane2.setHgap(30);
				   
				    Label code2= new Label("Code:");
					TextField codeTex2 = new TextField();
					
				   
					gamepane2.addRow(0, code2, codeTex2);
					
		    	
					Image imageGamedelete1=new Image("https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-delete-multimedia-kiranshastry-gradient-kiranshastry.png");
				    ImageView imageGamedeletevi1=new ImageView();
				    imageGamedeletevi1.setImage(imageGamedelete1);
				    imageGamedeletevi1.setFitWidth(15);
				    imageGamedeletevi1.setFitHeight(15);		
				    Button deleteGame1=new Button("delete",imageGamedeletevi1);
				    deleteGame1.setPrefSize(80,40);
				    gamepane2.add(deleteGame1,0,4);
				    
				    deleteGame1.setOnAction(d1->{
						
						for(int i=0;i<mr.getMediaData().size();i++) {
							if(mr.getMediaData().get(i).getCode().equals(codeTex2.getText())) {
								mr.getMediaData().remove(mr.getMediaData().get(i));

					       }
							
						}
						
					});

				    
					 
					Image imageGameBack2=new Image("https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
				    ImageView imageGameBackvi2=new ImageView();
				    imageGameBackvi2.setImage(imageGameBack2);
				    imageGameBackvi2.setFitWidth(15);
				    imageGameBackvi2.setFitHeight(15);		
				    Button backG2=new Button("back",imageGameBackvi2);
				    backG2.setPrefSize(80,40);
				    gamepane2.add(backG2, 1,4);
					
				    backG2.setOnAction(k3->{
				    	gameStage2.close();
				    });
					
				    Scene sceneGame2=new Scene(gamepane2,500,450);
				    gameStage2.setScene(sceneGame2);
				    gameStage2.setTitle("Add Game");
				    gameStage2.show();
	    		
	    	
	    		
	    		
		    	});
	    	
	    	///////////////////////////////////////////////////////////////////////////////////////////////////////////////

	    	m3.setOnAction(t1->{
	    		
	    		Stage stageMedia3=new Stage();
		    	   GridPane m33 = new GridPane();
		    	   m33.setPadding(new Insets(20,20,20,20));
		    	   m33.setAlignment(Pos.CENTER);
		    	   m33.setVgap(20);
		    	   m33.setHgap(20);
		 		   
		 		Button Game3=new Button("Game");
		 		Button Movie3=new Button("Movie");
		 		Button Album3=new Button("Album");
		 		
		 		Game3.setStyle("-fx-background-color:dodgerblue;-fx-background-radius:10px");
		 		Movie3.setStyle("-fx-background-color:dodgerblue;-fx-background-radius:10px");
		 		Album3.setStyle("-fx-background-color:dodgerblue;-fx-background-radius:10px");
		 		
		 		Game3.setPrefSize(250, 50);
		 		Movie3.setPrefSize(250, 50);
		 		Album3.setPrefSize(250, 50);
		 		
		 		
		 		
		 		m33.add(Game3, 2, 0);
		 		m33.add(Movie3, 2, 1);
		 		m33.add(Album3, 2, 2);
		 	    
		        Scene sceneMedia3=new Scene(m33,500,500);
		        stageMedia3.setScene(sceneMedia3);
		        stageMedia3.setTitle("Type of midea");
		        stageMedia3.show();
					
		    	Game3.setOnAction(t2->{
		    		
		    		   Stage gameStage3=new Stage();
			    	   GridPane gamepane3 = new GridPane();
			    	   gamepane3.setPadding(new Insets(50,50,50,50));
			    	   gamepane3.setVgap(30);
			    	   gamepane3.setHgap(30);
					   
					    Label code3= new Label("Code:");
						TextField codeTex3 = new TextField();
						Label title3= new Label("Title:");
						TextField titleTex3 = new TextField();
						Label numOfCopies3 = new Label("Number of copies:");
						TextField numOfCopiesTex3 = new TextField();
						Label weight3 = new Label("Weight:");
						TextField weightTex3 = new TextField();
					   
						
						
						gamepane3.addRow(0, code3, codeTex3);
						gamepane3.addRow(1, title3, titleTex3);
						gamepane3.addRow(2, numOfCopies3, numOfCopiesTex3);
						gamepane3.addRow(3, weight3, weightTex3);
			    	
						Image imageGameupdet1=new Image("https://img.icons8.com/cotton/344/loop.png");
					    ImageView imageGameupdetvi1=new ImageView();
					    imageGameupdetvi1.setImage(imageGameupdet1);
					    imageGameupdetvi1.setFitWidth(15);
					    imageGameupdetvi1.setFitHeight(15);		
					    Button updetGame1=new Button("Update",imageGameupdetvi1);
					    updetGame1.setPrefSize(80,40);
					    gamepane3.add(updetGame1,0,4);
					    
					    updetGame1.setOnAction(d3->{
							
							for(int i=0;i<mr.getMediaData().size();i++) {
								if(mr.getMediaData().get(i).getCode().equalsIgnoreCase(codeTex3.getText())) {
		
									
									
									mr.getMediaData().get(i).setTitle(titleTex3.getText());
									mr.getMediaData().get(i).setNumberOfCopiesAvailable(Integer.parseInt(numOfCopiesTex3.getText()));
									((Game)mr.getMediaData().get(i)).setWeight(Double.parseDouble(weightTex3.getText()));
									

							      	}
								}
							
						});
						
						Image imageGameBack3=new Image("https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
					    ImageView imageGameBackvi3=new ImageView();
					    imageGameBackvi3.setImage(imageGameBack3);
					    imageGameBackvi3.setFitWidth(15);
					    imageGameBackvi3.setFitHeight(15);		
					    Button backG3=new Button("back",imageGameBackvi3);
					    backG3.setPrefSize(80,40);
					    gamepane3.add(backG3, 1,4);
						
					    backG3.setOnAction(t3->{
					    	gameStage3.close();
					    });
						
					    Scene sceneGame3=new Scene(gamepane3,500,450);
					    gameStage3.setScene(sceneGame3);
					    gameStage3.setTitle("Add Game");
					    gameStage3.show();
		    		
		    	});
		    	
		               Movie3.setOnAction(t4->{
		            	   
		    	       Stage  movieStage3=new Stage();
			    	   GridPane moviepane3 = new GridPane();
			    	   moviepane3.setPadding(new Insets(50,50,50,50));
			    	   moviepane3.setVgap(30);
			    	   moviepane3.setHgap(30);
					   
					    Label codeM3= new Label("Code:");
						TextField codeMTex3 = new TextField();
						Label titleM3= new Label("Title:");
						TextField titleMTex3 = new TextField();
						Label numOfCopiesM3 = new Label("Number of copies:");
						TextField numOfCopiesMTex3 = new TextField();
						Label rating3 = new Label("Rating:");
						TextField ratingTex3 = new TextField();
					   
						moviepane3.addRow(0, codeM3, codeMTex3);
						moviepane3.addRow(1, titleM3, titleMTex3);
						moviepane3.addRow(2, numOfCopiesM3, numOfCopiesMTex3);
						moviepane3.addRow(3, rating3, ratingTex3);
			    	
						Image imageMovieupdate2=new Image("https://img.icons8.com/cotton/344/loop.png");
					    ImageView imageMovieupdatevi2=new ImageView();
					    imageMovieupdatevi2.setImage(imageMovieupdate2);
					    imageMovieupdatevi2.setFitWidth(15);
					    imageMovieupdatevi2.setFitHeight(15);		
					    Button updateMovie1=new Button("update",imageMovieupdatevi2);
					    updateMovie1.setPrefSize(80,40);
					    moviepane3.add(updateMovie1,0,4);
					    
					    updateMovie1.setOnAction(d3->{
							
							for(int i=0;i<mr.getMediaData().size();i++) {
								if(mr.getMediaData().get(i).getCode().equalsIgnoreCase(codeMTex3.getText())) {
									
									mr.getMediaData().get(i).setTitle(titleMTex3.getText());
									mr.getMediaData().get(i).setNumberOfCopiesAvailable(Integer.parseInt(numOfCopiesMTex3.getText()));
									((Movie)mr.getMediaData().get(i)).setRating(ratingTex3.getText());
									

							      	}
								}
							
						});
						
						Image imageMovieBack3=new Image("https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
					    ImageView imageMovieBackvi3=new ImageView();
					    imageMovieBackvi3.setImage(imageMovieBack3);
					    imageMovieBackvi3.setFitWidth(15);
					    imageMovieBackvi3.setFitHeight(15);		
					    Button backM3=new Button("back",imageMovieBackvi3);
					    backM3.setPrefSize(80,40);
					    moviepane3.add(backM3, 1,4);
					    
					    backM3.setOnAction(t5->{
					    	movieStage3.close();
					    });
						
					    Scene sceneMovie3=new Scene(moviepane3,500,450);
					    movieStage3.setScene(sceneMovie3);
					    movieStage3.setTitle("Add movie");
					    movieStage3.show();
		    		
		    	});
		               
		               Album3.setOnAction(t6->{
		            	   
			    	       Stage  albumStage3=new Stage();
				    	   GridPane albumpane3 = new GridPane();
				    	   albumpane3.setPadding(new Insets(50,50,50,50));
				    	   albumpane3.setVgap(30);
				    	   albumpane3.setHgap(30);
						   
						    Label codeA3= new Label("Code:");
							TextField codeATex3 = new TextField();
							Label titleA3= new Label("Title:");
							TextField titleATex3 = new TextField();
							Label numOfCopiesA3= new Label("Number of copies:");
							TextField numOfCopiesATex3 = new TextField();
							Label artist3 = new Label("Artist:");
							TextField artistTex3 = new TextField();
							Label songs3 = new Label("Songs:");
							TextField songsTex3 = new TextField();
						   
							albumpane3.addRow(0, codeA3, codeATex3);
							albumpane3.addRow(1, titleA3, titleATex3);
							albumpane3.addRow(2, numOfCopiesA3, numOfCopiesATex3);
							albumpane3.addRow(3, artist3, artistTex3);
							albumpane3.addRow(4, songs3, songsTex3);

				    	
							Image imageAlbumeupdate1=new Image("https://img.icons8.com/cotton/344/loop.png");
						    ImageView imageAlbumeupdatevi1=new ImageView();
						    imageAlbumeupdatevi1.setImage(imageAlbumeupdate1);
						    imageAlbumeupdatevi1.setFitWidth(15);
						    imageAlbumeupdatevi1.setFitHeight(15);		
						    Button updateAlbum1=new Button("update",imageAlbumeupdatevi1);
						    updateAlbum1.setPrefSize(80,40);
						    albumpane3.add(updateAlbum1,0,5);
						    
						    updateAlbum1.setOnAction(d3->{
								
								for(int i=0;i<mr.getMediaData().size();i++) {
									if(mr.getMediaData().get(i).getCode().equalsIgnoreCase(codeATex3.getText())) {
										
										mr.getMediaData().get(i).setTitle(titleATex3.getText());
										mr.getMediaData().get(i).setNumberOfCopiesAvailable(Integer.parseInt(numOfCopiesATex3.getText()));
										((Album)mr.getMediaData().get(i)).setArtist(artistTex3.getText());
										((Album)mr.getMediaData().get(i)).setSonge(songsTex3.getText());


										

								      	}
									}
								
							});
							
							Image imageAlbumeBack3=new Image("https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
						    ImageView imageAlbumeBackvi3=new ImageView();
						    imageAlbumeBackvi3.setImage(imageAlbumeBack3);
						    imageAlbumeBackvi3.setFitWidth(15);
						    imageAlbumeBackvi3.setFitHeight(15);		
						    Button backA3=new Button("back",imageAlbumeBackvi3);
						    backA3.setPrefSize(80,40);
						    albumpane3.add(backA3, 1,5);
						    
						    backA3.setOnAction(t7->{
						    	albumStage3.close();
						    });
							
						    Scene sceneAlbum3=new Scene(albumpane3,500,450);
						    albumStage3.setScene(sceneAlbum3);
						    albumStage3.setTitle("Add album");
						    albumStage3.show();
			  
	    	});
	    		
	    });  
	    	//////////////////////////////////////////////////////
	    	m4.setOnAction(q1->{
	    		
	    		Stage stageMedia4=new Stage();
		    	   GridPane m44 = new GridPane();
		    	   m44.setPadding(new Insets(20,20,20,20));
		    	   m44.setAlignment(Pos.CENTER);
		    	   m44.setVgap(20);
		    	   m44.setHgap(20);
		 		   
		 		Button Game4=new Button("Game");
		 		Button Movie4=new Button("Movie");
		 		Button Album4=new Button("Album");
		 		
		 		Game4.setStyle("-fx-background-color:dodgerblue;-fx-background-radius:10px");
		 		Movie4.setStyle("-fx-background-color:dodgerblue;-fx-background-radius:10px");
		 		Album4.setStyle("-fx-background-color:dodgerblue;-fx-background-radius:10px");
		 		
		 		Game4.setPrefSize(250, 50);
		 		Movie4.setPrefSize(250, 50);
		 		Album4.setPrefSize(250, 50);
		 		
		 		m44.add(Game4, 2, 0);
		 		m44.add(Movie4, 2, 1);
		 		m44.add(Album4, 2, 2);
		 	    
		        Scene sceneMedia4=new Scene(m44,500,450);
		        stageMedia4.setScene(sceneMedia4);
		        stageMedia4.setTitle("Type of midea");
		        stageMedia4.show();
					
		    	Game4.setOnAction(q2->{
		    		
		    		   Stage gameStage4=new Stage();
			    	   GridPane gamepane4 = new GridPane();
			    	   gamepane4.setPadding(new Insets(50,50,50,50));
			    	   gamepane4.setVgap(30);
			    	   gamepane4.setHgap(30);
					   
					    Label code4= new Label("Code:");
						TextField codeTex4 = new TextField();
						Label title4= new Label("Title:");
						TextField titleTex4 = new TextField();
						Label numOfCopies4 = new Label("Number of copies:");
						TextField numOfCopiesTex4 = new TextField();
						Label weight4 = new Label("Weight:");
						TextField weightTex4 = new TextField();
					   
						
						
						gamepane4.addRow(0, code4, codeTex4);
						gamepane4.addRow(1, title4, titleTex4);
						gamepane4.addRow(2, numOfCopies4, numOfCopiesTex4);
						gamepane4.addRow(3, weight4, weightTex4);
			    	
						Image imageGamesearch1=new Image("https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-search-alignment-and-tools-kiranshastry-gradient-kiranshastry.png");
					    ImageView imageGamesearchvi1=new ImageView();
					    imageGamesearchvi1.setImage(imageGamesearch1);
					    imageGamesearchvi1.setFitWidth(15);
					    imageGamesearchvi1.setFitHeight(15);		
					    Button searchGame1=new Button("search",imageGamesearchvi1);
					    searchGame1.setPrefSize(80,40);
					    gamepane4.add(searchGame1,0,4);
					    
					    searchGame1.setOnAction(d9->{
							for(int i=0;i<mr.getMediaData().size();i++) {
								if(mr.getMediaData().get(i).getCode().equalsIgnoreCase(codeTex4.getText())) {
									
									numOfCopiesTex4.setText(Integer.toString(mr.getMediaData().get(i).getNumberOfCopiesAvailable()));	
									titleTex4.setText(mr.getMediaData().get(i).getTitle());
									weightTex4.setText(Double.toString(((Game)mr.getMediaData().get(i)).getWeight()));
									
								}
							}
						});
						
						Image imageGameBack4=new Image("https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
					    ImageView imageGameBackvi4=new ImageView();
					    imageGameBackvi4.setImage(imageGameBack4);
					    imageGameBackvi4.setFitWidth(15);
					    imageGameBackvi4.setFitHeight(15);		
					    Button backG4=new Button("back",imageGameBackvi4);
					    backG4.setPrefSize(80,40);
					    gamepane4.add(backG4, 1,4);
						
					    backG4.setOnAction(q3->{
					    	gameStage4.close();
					    });
						
					    Scene sceneGame4=new Scene(gamepane4,500,450);
					    gameStage4.setScene(sceneGame4);
					    gameStage4.setTitle("Add Game");
					    gameStage4.show();
		    		
		    	});
		    	
		               Movie4.setOnAction(q4->{
		            	   
		    	       Stage  movieStage4=new Stage();
			    	   GridPane moviepane4 = new GridPane();
			    	   moviepane4.setPadding(new Insets(50,50,50,50));
			    	   moviepane4.setVgap(30);
			    	   moviepane4.setHgap(30);
					   
					    Label codeM4= new Label("Code:");
						TextField codeMTex4 = new TextField();
						Label titleM4= new Label("Title:");
						TextField titleMTex4 = new TextField();
						Label numOfCopiesM4 = new Label("Number of copies:");
						TextField numOfCopiesMTex4 = new TextField();
						Label rating4= new Label("Rating:");
						TextField ratingTex4 = new TextField();
					   
						moviepane4.addRow(0, codeM4, codeMTex4);
						moviepane4.addRow(1, titleM4, titleMTex4);
						moviepane4.addRow(2, numOfCopiesM4, numOfCopiesMTex4);
						moviepane4.addRow(3, rating4, ratingTex4);
			    	
						Image imageMoviesearch2=new Image("https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-search-alignment-and-tools-kiranshastry-gradient-kiranshastry.png");
					    ImageView imageMoviesearchvi2=new ImageView();
					    imageMoviesearchvi2.setImage(imageMoviesearch2);
					    imageMoviesearchvi2.setFitWidth(15);
					    imageMoviesearchvi2.setFitHeight(15);		
					    Button searchMovie1=new Button("search",imageMoviesearchvi2);
					    searchMovie1.setPrefSize(80,40);
					    moviepane4.add(searchMovie1,0,4);
					    
					    searchMovie1.setOnAction(d9->{
							for(int i=0;i<mr.getMediaData().size();i++) {
								if(mr.getMediaData().get(i).getCode().equalsIgnoreCase(codeMTex4.getText())) {
									
									numOfCopiesMTex4.setText(Integer.toString(mr.getMediaData().get(i).getNumberOfCopiesAvailable()));	
									titleMTex4.setText(mr.getMediaData().get(i).getTitle());
									ratingTex4.setText(((Movie)mr.getMediaData().get(i)).getRating());
									
								}
							}
						});
						
						
						Image imageMovieBack4=new Image("https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
					    ImageView imageMovieBackvi4=new ImageView();
					    imageMovieBackvi4.setImage(imageMovieBack4);
					    imageMovieBackvi4.setFitWidth(15);
					    imageMovieBackvi4.setFitHeight(15);		
					    Button backM4=new Button("back",imageMovieBackvi4);
					    backM4.setPrefSize(80,40);
					    moviepane4.add(backM4, 1,4);
					    
					    backM4.setOnAction(q5->{
					    	movieStage4.close();
					    });
						
					    Scene sceneMovie4=new Scene(moviepane4,500,450);
					    movieStage4.setScene(sceneMovie4);
					    movieStage4.setTitle("Add movie");
					    movieStage4.show();
		    		
		    	});
		               
		               Album4.setOnAction(q6->{
		            	   
			    	       Stage  albumStage4=new Stage();
				    	   GridPane albumpane4 = new GridPane();
				    	   albumpane4.setPadding(new Insets(50,50,50,50));
				    	   albumpane4.setVgap(30);
				    	   albumpane4.setHgap(30);
						   
						    Label codeA4= new Label("Code:");
							TextField codeATex4 = new TextField();
							Label titleA4= new Label("Title:");
							TextField titleATex4 = new TextField();
							Label numOfCopiesA4= new Label("Number of copies:");
							TextField numOfCopiesATex4 = new TextField();
							Label artist4 = new Label("Artist:");
							TextField artistTex4 = new TextField();
							Label songs4 = new Label("Songs:");
							TextField songsTex4 = new TextField();
						   
							albumpane4.addRow(0, codeA4, codeATex4);
							albumpane4.addRow(1, titleA4, titleATex4);
							albumpane4.addRow(2, numOfCopiesA4, numOfCopiesATex4);
							albumpane4.addRow(3, artist4, artistTex4);
							albumpane4.addRow(4, songs4, songsTex4);

				    	
							Image imageAlbumesearch1=new Image("https://img.icons8.com/external-kiranshastry-gradient-kiranshastry/344/external-search-alignment-and-tools-kiranshastry-gradient-kiranshastry.png");
						    ImageView imageAlbumesearchvi1=new ImageView();
						    imageAlbumesearchvi1.setImage(imageAlbumesearch1);
						    imageAlbumesearchvi1.setFitWidth(15);
						    imageAlbumesearchvi1.setFitHeight(15);		
						    Button searchAlbum1=new Button("search",imageAlbumesearchvi1);
						    searchAlbum1.setPrefSize(80,40);
						    albumpane4.add(searchAlbum1,0,5);
						    
						    searchAlbum1.setOnAction(d9->{
								for(int i=0;i<mr.getMediaData().size();i++) {
									if(mr.getMediaData().get(i).getCode().equalsIgnoreCase(codeATex4.getText())) {
										
										numOfCopiesATex4.setText(Integer.toString(mr.getMediaData().get(i).getNumberOfCopiesAvailable()));	
										titleATex4.setText(mr.getMediaData().get(i).getTitle());
										artistTex4.setText((((Album) mr.getMediaData().get(i)).getArtist()));
										songsTex4.setText((((Album) mr.getMediaData().get(i)).getSonge()));

										
									}
								}
							});
							
							Image imageAlbumeBack4=new Image("https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
						    ImageView imageAlbumeBackvi4=new ImageView();
						    imageAlbumeBackvi4.setImage(imageAlbumeBack4);
						    imageAlbumeBackvi4.setFitWidth(15);
						    imageAlbumeBackvi4.setFitHeight(15);		
						    Button backA4=new Button("back",imageAlbumeBackvi4);
						    backA4.setPrefSize(80,40);
						    albumpane4.add(backA4, 1,5);
						    
						    backA4.setOnAction(q7->{
						    	albumStage4.close();
						    });
							
						    Scene sceneAlbum4=new Scene(albumpane4,500,450);
						    albumStage4.setScene(sceneAlbum4);
						    albumStage4.setTitle("Add album");
						    albumStage4.show();
			  
	    	});
	    		
	    });  
		   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	    	m5.setOnAction(v->{
	  		  Stage  rentStage2=new Stage();
	    	   GridPane rentpane2 = new GridPane();
	    	   rentpane2.setPadding(new Insets(20,20,20,20));
	    	   rentpane2.setVgap(20);
	    	   rentpane2.setHgap(30);
			   
			    Label renttext2= new Label("Information");
				
			    TextArea  textArea2= new TextArea();

			    
			    Image imagerentback2=new Image("https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
			    ImageView imagerentbackvi2=new ImageView();
			    imagerentbackvi2.setImage(imagerentback2);
			    imagerentbackvi2.setFitWidth(15);
			    imagerentbackvi2.setFitHeight(15);		
			    Button backre2=new Button("back",imagerentbackvi2);
			    backre2.setPrefSize(100,40);
			    rentpane2.add(backre2, 1,3);
			    
			    backre2.setOnAction(w4->{
			    	rentStage2.close();
			    });
			    
			    Image imageintreted1=new Image("https://img.icons8.com/office/344/print.png");
			    ImageView imageintretedvi1=new ImageView();
			    imageintretedvi1.setImage(imageintreted1);
			    imageintretedvi1.setFitWidth(15);
			    imageintretedvi1.setFitHeight(15);		
			    Button intreted1=new Button("Print all informaton",imageintretedvi1);
			    intreted1.setPrefSize(145,40);
			    rentpane2.add(intreted1,0,3);
			    
			    intreted1.setOnAction(u->{
			    	
			    	textArea2.setText(mr.getAllMediaInfo()) ;
			    	
			    	
			    });
			    
			    rentpane2.addRow(2, renttext2);
			    rentpane2.addRow(2,textArea2);
			   

			    
				Scene sceneRent2=new Scene(rentpane2,800,400);
				rentStage2.setScene(sceneRent2);
				rentStage2.setTitle("print");
				rentStage2.show();
			  		    	  
	    		
	    		
	    		
	    	});
	    	m6.setOnAction(v9->{
	    		sm1.close();
	    	});
	    	
	 });
	    //----------------------------------------------------------------------------------------------------------//

	    x3.setOnAction(bm1->{
	    	   Stage rn1=new Stage();
			   GridPane rootr1 = new GridPane();
			   rootr1.setPadding(new Insets(20,20,20,20));
			   rootr1.setAlignment(Pos.CENTER);
			   rootr1.setVgap(20);
			   rootr1.setHgap(20);
			   
			   Button xr1=new Button("Rent form");
			   Button xr2=new Button("Print the requested interested");
			   Button xr3=new Button("Print the rented media");
			   Button xr4=new Button("Return rented media");
			   Button xr5=new Button("Return media page");

			   xr1.setStyle("-fx-background-color:dodgerblue;-fx-background-radius:10px");
			   xr2.setStyle("-fx-background-color:dodgerblue;-fx-background-radius:10px");
			   xr3.setStyle("-fx-background-color:dodgerblue;-fx-background-radius:10px");
			   xr4.setStyle("-fx-background-color:dodgerblue;-fx-background-radius:10px");
			   xr5.setStyle("-fx-background-color:dodgerblue;-fx-background-radius:10px");

			    xr1.setPrefSize(250, 50);
				xr2.setPrefSize(250, 50);
				xr3.setPrefSize(250, 50);
				xr4.setPrefSize(250, 50);
				xr5.setPrefSize(250, 50);
				
			   rootr1.add(xr1, 2, 0);
			   rootr1.add(xr2, 2, 1);
			   rootr1.add(xr3, 2, 2);
			   rootr1.add(xr4, 2, 3);
			   rootr1.add(xr5, 2, 4);

			   Scene scener1=new Scene(rootr1,500,500);
			   rn1.setScene(scener1);
			   rn1.setTitle("Media Window page");
			   rn1.show();   	
	    	
	    	 
			  xr1.setOnAction(w1->{
				  
				   Stage  rentStage1=new Stage();
		    	   GridPane rentpane1 = new GridPane();
		    	   rentpane1.setPadding(new Insets(50,50,50,50));
		    	   rentpane1.setVgap(30);
		    	   rentpane1.setHgap(30);
				   
				    Label renttext1= new Label("Customer Id:");
				    TextField  textField1= new TextField();
					
				    Button bot1=new Button("Show customer information:");
				    TextArea  textArea1= new TextArea();

				    bot1.setOnAction(p00->{
				    	for(int i=0;i<mr.getCustomerData().size();i++) {
				    		if(mr.getCustomerData().get(i).getID().equals(textField1.getText())) {
				    			
				    			textArea1.setText(mr.getCustomerData().get(i).toString());
				    		}
				    		
				    	}
				    	
				    });
				    
					Label renttext2= new Label("Media code:");
					TextField textField2 = new TextField();
					
				    Button bot2=new Button("Show media information:");
				    TextArea  textArea2= new TextArea();
				    
				    bot2.setOnAction(p->{
				    	for(int i=0;i<mr.getMediaData().size();i++) {
				    		if(mr.getMediaData().get(i).getCode().equals(textField2.getText())) {
				    			
				    			textArea2.setText(mr.getMediaData().get(i).toString());
				    		}
				    	}
				    	
				    });
				    Label renttext3= new Label("Rented Date:");
				    TextField  textField3= new TextField();
				    
				    Image imagerentback1=new Image("https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
				    ImageView imagerentbackvi1=new ImageView();
				    imagerentbackvi1.setImage(imagerentback1);
				    imagerentbackvi1.setFitWidth(15);
				    imagerentbackvi1.setFitHeight(15);		
				    Button backre1=new Button("back",imagerentbackvi1);
				    backre1.setPrefSize(100,40);
				    rentpane1.add(backre1, 2,5);
				    backre1.setOnAction(w3->{
				    	rentStage1.close();
				    });
				    
				    Image imageAlbumeadd1=new Image("https://img.icons8.com/cute-clipart/344/add.png");
				    ImageView imageAlbumeaddvi1=new ImageView();
				    imageAlbumeaddvi1.setImage(imageAlbumeadd1);
				    imageAlbumeaddvi1.setFitWidth(15);
				    imageAlbumeaddvi1.setFitHeight(15);		
				    Button addAlbum1=new Button("Add To cart",imageAlbumeaddvi1);
				    addAlbum1.setPrefSize(120,40);
				    rentpane1.add(addAlbum1,0,5);
				    
				    addAlbum1.setOnAction(u0->{
				    	
				    	mr.addToCart(textField1.getText(), textArea1.getText());
				    });
				    
				    Image imageProcessCart1=new Image("https://img.icons8.com/emoji/344/shopping-cart-emoji.png");
				    ImageView imageProcessCartvi1=new ImageView();
				    imageProcessCartvi1.setImage(imageProcessCart1);
				    imageProcessCartvi1.setFitWidth(15);
				    imageProcessCartvi1.setFitHeight(15);		
				    Button Process1=new Button("Process Cart",imageProcessCartvi1);
				    Process1.setPrefSize(120,40);
				    rentpane1.add(Process1,1,5);
				    
				    Process1.setOnAction(p00->{
				    	
				    	mr.processRequests();
				    	
				    });
				    
				    rentpane1.addRow(0, renttext1, textField1);
				    rentpane1.addRow(1, bot1, textArea1);
				    rentpane1.addRow(2, renttext2, textField2);
				    rentpane1.addRow(3, bot2, textArea2);
				    rentpane1.addRow(4, renttext3, textField3);

				    
					Scene sceneRent1=new Scene(rentpane1,900,650);
					rentStage1.setScene(sceneRent1);
					rentStage1.setTitle("rent form");
					rentStage1.show();
				 
			  });
	    	 
	    	
			  xr2.setOnAction(w2->{
				  
				  Stage  rentStage2=new Stage();
		    	   GridPane rentpane2 = new GridPane();
		    	   rentpane2.setPadding(new Insets(20,20,20,20));
		    	   rentpane2.setVgap(20);
		    	   rentpane2.setHgap(30);
				   
				    Label renttext2= new Label("Customer Id:");
				    TextField  textField2= new TextField();
					
				    TextArea  textArea2= new TextArea(" the customer intreted");

				    
				    Image imagerentback2=new Image("https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
				    ImageView imagerentbackvi2=new ImageView();
				    imagerentbackvi2.setImage(imagerentback2);
				    imagerentbackvi2.setFitWidth(15);
				    imagerentbackvi2.setFitHeight(15);		
				    Button backre2=new Button("back",imagerentbackvi2);
				    backre2.setPrefSize(100,40);
				    rentpane2.add(backre2, 1,3);
				    
				    backre2.setOnAction(w4->{
				    	rentStage2.close();
				    });
				    
				    Image imageintreted1=new Image("https://img.icons8.com/office/344/print.png");
				    ImageView imageintretedvi1=new ImageView();
				    imageintretedvi1.setImage(imageintreted1);
				    imageintretedvi1.setFitWidth(15);
				    imageintretedvi1.setFitHeight(15);		
				    Button intreted1=new Button("Print intreted",imageintretedvi1);
				    intreted1.setPrefSize(120,40);
				    rentpane2.add(intreted1,0,3);
				    
				    intreted1.setOnAction(m->{
				    	for(int j=0 ; j<mr.getCustomerData().size();j++) {
				    		if(mr.getCustomerData().get(j).getID().equals(textField2.getText()) ) {
				
				    			
				    			textArea2.setText(mr.getCustomerData().get(j).getInterested().toString() );
				    			
				    		}
				    		
				    	}
				    	
				    });
				    
				    rentpane2.addRow(0 , renttext2,textField2);
				    rentpane2.addRow(2,textArea2);
				   

				    
					Scene sceneRent2=new Scene(rentpane2,800,400);
					rentStage2.setScene(sceneRent2);
					rentStage2.setTitle("print");
					rentStage2.show();
				  
			  });
	    	
	    	xr3.setOnAction(w5->{
	    		
	    		 Stage  rentStage3=new Stage();
		    	   GridPane rentpane3 = new GridPane();
		    	   rentpane3.setPadding(new Insets(20,20,20,20));
		    	   rentpane3.setVgap(20);
		    	   rentpane3.setHgap(30);
				   
				    Label renttext3= new Label("Customer Id:");
				    TextField  textField3= new TextField();
					
				    TextArea  textArea3= new TextArea("the customer intreted");

				    
				    Image imagerentback3=new Image("https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
				    ImageView imagerentbackvi3=new ImageView();
				    imagerentbackvi3.setImage(imagerentback3);
				    imagerentbackvi3.setFitWidth(15);
				    imagerentbackvi3.setFitHeight(15);		
				    Button backre3=new Button("back",imagerentbackvi3);
				    backre3.setPrefSize(100,40);
				    rentpane3.add(backre3, 1,3);
				    
				    backre3.setOnAction(w7->{
				    	rentStage3.close();
				    });
				    
				    Image imageintreted3=new Image("https://img.icons8.com/office/344/print.png");
				    ImageView imageintretedvi3=new ImageView();
				    imageintretedvi3.setImage(imageintreted3);
				    imageintretedvi3.setFitWidth(15);
				    imageintretedvi3.setFitHeight(15);		
				    Button intreted3=new Button("Print rented media",imageintretedvi3);
				    intreted3.setPrefSize(180,40);
				    rentpane3.add(intreted3,0,3);
				    
				    intreted3.setOnAction(m->{
				    	for(int j=0 ; j<mr.getCustomerData().size();j++) {
				    		if(mr.getCustomerData().get(j).getID().equals(textField3.getText()) ) {
				    			
				    			textArea3.setText(mr.getCustomerData().get(j).getRented().toString() );
				    			
				    		}
				    		
				    	}
				    	
				    });
				    
				    rentpane3.addRow(0, renttext3, textField3);
				    rentpane3.addRow(2,textArea3);
				   

				    
					Scene sceneRent3=new Scene(rentpane3,800,400);
					rentStage3.setScene(sceneRent3);
					rentStage3.setTitle("print");
					rentStage3.show();
				  
	    		
	    	});
	    	
	    	xr4.setOnAction(w8->{
	    		
	    		Stage  rentStage4=new Stage();
		  
	    		GridPane rentpane4 = new GridPane();
		    	   rentpane4.setPadding(new Insets(50,50,50,50));
		    	   rentpane4.setVgap(30);
		    	   rentpane4.setHgap(30);
				   
				    Label renttext1= new Label("Customer Id:");
				    TextField  textField1= new TextField();
				    
					Label renttext2= new Label("Media code:");
					TextField textField2 = new TextField();
					
				   
				    
				    Image imagerentback1=new Image("https://img.icons8.com/external-others-phat-plus/344/external-back-essential-blue-others-phat-plus.png");
				    ImageView imagerentbackvi1=new ImageView();
				    imagerentbackvi1.setImage(imagerentback1);
				    imagerentbackvi1.setFitWidth(15);
				    imagerentbackvi1.setFitHeight(15);		
				    Button backre1=new Button("back",imagerentbackvi1);
				    backre1.setPrefSize(100,40);
				    rentpane4.add(backre1, 2,2);
				    backre1.setOnAction(w9->{
				    	rentStage4.close();
				    });
				    
				    
				   
				    
				    Image imageintreted1=new Image("https://img.icons8.com/windows/344/replace.png");
				    ImageView imageintretedvi1=new ImageView();
				    imageintretedvi1.setImage(imageintreted1);
				    imageintretedvi1.setFitWidth(15);
				    imageintretedvi1.setFitHeight(15);		
				    Button intreted1=new Button("Return Midea",imageintretedvi1);
				    intreted1.setPrefSize(120,40);
				    rentpane4.add(intreted1,0,2);
				    
				    intreted1.setOnAction(b0->{
				    	
				    	mr.returnMedia(textField1.getText(), textField2.getText());
				    	
				    	
				    	
				    	
				    });
				    
				    
				    rentpane4.addRow(0, renttext1, textField1);
				    rentpane4.addRow(1, renttext2, textField2);
				    
				    
					Scene sceneRent4=new Scene(rentpane4,600,400);
					rentStage4.setScene(sceneRent4);
					rentStage4.setTitle("Return midea");
					rentStage4.show();
	    		
	    	});
	    	
	    	xr5.setOnAction(w11->{
	    		rn1.close();
	    		
	    	});
	    	
	    });
	}
	

	public static void main(String[] args) {
		launch(args);
		
				
	}
}