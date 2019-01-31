package com.example.crashathon;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean[] bugfound=new boolean[7];

    String s1;
    String s2;
    String s3;
    String s4;
    String s5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button v1 = findViewById(R.id.v1);
        Button v2 = findViewById(R.id.v2);
        Button v3 = findViewById(R.id.v3);
        Button v4 = findViewById(R.id.v4);
        Button v5 = findViewById(R.id.v5);
        Button v6=findViewById(R.id.v6);
        final RadioButton r1 = findViewById(R.id.r1);
        final RadioButton r2 = findViewById(R.id.r2);
        final EditText et1 = findViewById(R.id.et1);
        final EditText et2 = findViewById(R.id.et2);
        final EditText et3 = findViewById(R.id.et3);
        final EditText et4 = findViewById(R.id.et4);
        final EditText et5 = findViewById(R.id.et5);





            r1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bugfound[0]=!bugfound[0];

                    r1.setChecked(bugfound[0]);
                }
            });

        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bugfound[1]=!bugfound[1];

                r2.setChecked(bugfound[1]);
            }
        });



            v1.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                         s1=et1.getText().toString();

                                          InputMethodManager mgr = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                                          mgr.hideSoftInputFromWindow(et1.getWindowToken(), 0);
                                          et1.setText(s1);






                                      }


                                  }

            );





            v2.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {

                                          if(bugfound[0]&&bugfound[1]&&!bugfound[2])
                                          {
                                              Toast.makeText(getApplicationContext(),"new bug found",Toast.LENGTH_SHORT).show();

                                              bugfound[2]=true;
                                          }

                                          else if(bugfound[2])
                                          {
                                              Toast.makeText(getApplicationContext(),"already found",Toast.LENGTH_SHORT).show();
                                          }


                                      }
                                  }

            );


            v3.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {

                                            s2=et2.getText().toString();
                                          InputMethodManager mgr = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                                          mgr.hideSoftInputFromWindow(et2.getWindowToken(), 0);
                                          et2.setText(s2);


                                          if(Integer.parseInt(s2)>100&&!bugfound[3])
                                          {
                                              Toast.makeText(getApplicationContext(),"new bug found",Toast.LENGTH_SHORT).show();
                                              bugfound[3]=true;
                                          }

                                          else if(bugfound[3]==true)
                                          {
                                              Toast.makeText(getApplicationContext(),"already found",Toast.LENGTH_SHORT).show();
                                          }





                                      }
                                  }

            );

            v4.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          s3=et3.getText().toString();
                                          InputMethodManager mgr = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                                          mgr.hideSoftInputFromWindow(et3.getWindowToken(), 0);
                                          et3.setText(s3);


                                          if(s3.equals("30/02")&&!bugfound[4])
                                          {
                                              Toast.makeText(getApplicationContext(),"new bug found",Toast.LENGTH_SHORT).show();
                                              bugfound[4]=true;
                                          }

                                          else if(bugfound[4]==true)
                                          {
                                              Toast.makeText(getApplicationContext(),"already found",Toast.LENGTH_SHORT).show();
                                          }



                                      }
                                  }

            );


            v5.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {

                                            s4=et4.getText().toString();
                                          InputMethodManager mgr = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                                          mgr.hideSoftInputFromWindow(et4.getWindowToken(), 0);
                                          et4.setText(s4);


                                          if( !s4.matches("[0-9]+")&&!bugfound[5])
                                          {
                                              Toast.makeText(getApplicationContext(),"new bug found",Toast.LENGTH_SHORT).show();
                                              bugfound[5]=true;
                                          }

                                          else if(bugfound[5]==true)
                                          {
                                              Toast.makeText(getApplicationContext(),"already found",Toast.LENGTH_SHORT).show();
                                          }



                                      }
                                  }

            );



        v6.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {

                                      s5=et5.getText().toString();
                                      InputMethodManager mgr = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                                      mgr.hideSoftInputFromWindow(et5.getWindowToken(), 0);
                                      et5.setText(s5);


                                      if(Integer.parseInt(s5)/10000!=0 &&!bugfound[6])
                                      {
                                          Toast.makeText(getApplicationContext(),"new bug found",Toast.LENGTH_SHORT).show();
                                          bugfound[6]=true;
                                      }

                                      else if(bugfound[6]==true)
                                      {
                                          Toast.makeText(getApplicationContext(),"already found",Toast.LENGTH_SHORT).show();
                                      }



                                  }
                              }

        );


        }

    }

