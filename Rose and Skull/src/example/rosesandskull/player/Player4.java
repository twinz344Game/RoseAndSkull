package example.rosesandskull.player;

/***************************
 * プレイヤー4の処理クラス *
 ***************************/
public class Player4 extends Actor {

	// 変数宣言
	private int player = 3; // ボード配置場所
	private String name = "プレイヤー4";

	/******************
	 * コンストラクタ *
	 ******************/
	public Player4() {
		boardSet(player);
		super.name = name;
	}

	/*********************************
	 * caldSetメソッド               * 
	 * 内容 : caldクラス配列に       *
	 * 		  カードの情報を格納する *
	 *********************************/
	@Override
	public void caldSet() {

		// カードの初期化
		for (int i = 0; i < cald.length; i++) {
			// カードの座標の設定
			cald[i].caldX = CALD_X + (SPACE * i); // x座標の設定
			cald[i].caldY = CALD_Y; // y座標の設定

			cald[i].flag = true; // カードを使ってない設定にする

			// カードの設定
			if (i == SKULL)
				cald[i].Table = Texture.SKULL4; // 髑髏のカードをセットする
			else
				cald[i].Table = Texture.ROSES4; // 薔薇のカードをセットする

			reverse[i] = null;
		}

		//playerCald = Texture.CALD4;
	}
}
