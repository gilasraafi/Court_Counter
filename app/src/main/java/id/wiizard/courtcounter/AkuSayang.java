package id.wiizard.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class AkuSayang extends AppCompatActivity
{
    private TextView tvScoreTeamA;
    private TextView tvScoreTeamB;
    private Button btn3a;
    private  Button btn2a;
    private Button freea;
    private Button btn3b;
    private Button btn2b;
    private Button freeb;
    private  Button reset;
    private int ScoreTeamA;
    private  int ScoreTeamB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init()
    {
        tvScoreTeamA = (TextView) findViewById(R.id.tv_score_team_a);
        tvScoreTeamB = (TextView) findViewById(R.id.tv_score_team_b);
        btn3a = (TextView) findViewById((R.id.);
        btn2a = (TextView) findViewById(R.id.btn_2_a);
        freea = (TextView) findViewById(R.id.btn_free_a);
        btn3b = (TextView) findViewById(R.id.btn_3_b);
        btn2b = (TextView) findViewById(R.id.btn_2_b);
        freeb = (TextView)findViewById(R.id.btn_free_b);
        reset = (TextView) findViewById(R.id.reset);
        ScoreTeamA = 0;
        btn3a.setOnClickListener(.);




    }
}