package com.swan.aistudio;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.*;
import com.swan.aistudio.databinding.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class MainActivity extends Activity {
	
	private MainBinding binding;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		binding = MainBinding.inflate(getLayoutInflater());
		setContentView(binding.getRoot());
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		binding.webview2.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				
				super.onPageFinished(_param1, _param2);
			}
		});
		
		binding.button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				binding.linear4.setVisibility(View.VISIBLE);
			}
		});
		
		binding.button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				binding.linear4.setVisibility(View.GONE);
			}
		});
		
		binding.circleimageview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				binding.webview2.loadUrl("https://chatgpt.com");
			}
		});
		
		binding.circleimageview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				binding.webview2.loadUrl("https://chat.mistral.ai");
			}
		});
		
		binding.circleimageview11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				binding.webview2.loadUrl("https://claude.ai");
			}
		});
		
		binding.circleimageview12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				binding.webview2.loadUrl("https://www.perplexity.ai");
			}
		});
		
		binding.circleimageview13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				binding.webview2.loadUrl("https://gemini.google.com");
			}
		});
		
		binding.circleimageview14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				binding.webview2.loadUrl("https://lumo.proton.me");
			}
		});
		
		binding.circleimageview15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				binding.webview2.loadUrl("https://copilot.microsoft.com");
			}
		});
		
		binding.circleimageview16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				binding.webview2.loadUrl("https://github.com/copilot");
			}
		});
		
		binding.circleimageview17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				binding.webview2.loadUrl("https://aistudio.google.com");
			}
		});
		
		binding.circleimageview18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				binding.webview2.loadUrl("https://labs.google.com");
			}
		});
	}
	
	private void initializeLogic() {
		binding.linear4.setVisibility(View.GONE);
		binding.webview2.setVisibility(View.VISIBLE);
		binding.linear1.setVisibility(View.VISIBLE);
		binding.webview2.loadUrl("https://google.com");
	}
	
}