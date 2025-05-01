package 演習問題;

public class BankAccount {
	public String DepositName; //口座名義
	public int DepositId, DepositBanlance; //口座番号、残高
	
	
	public BankAccount(int DepositBanlance, String DepositName, int DepositId) {
		this.DepositBanlance = DepositBanlance;
		this.DepositName = DepositName;
		this.DepositId = DepositId;
	}


	public int getDepositBanlance() {
		return DepositBanlance;
	}

	public String getDepositName() {
		return DepositName;
	}

	public int getDepositId() {
		return DepositId;
	}
	
	public void deposit(int MoneyFlow) { //入金メソッド
		if (MoneyFlow > 0) {
			DepositBanlance += MoneyFlow;
		}else {
			System.out.println("非常識な接近です。");
		}
	}
	public void widthraw(int MoneyFlow) { //引き出しメソッド
		if (MoneyFlow > 0 && MoneyFlow <= DepositBanlance) {
			MoneyFlow -= DepositBanlance;
		} else {
			System.out.println("残高不足で引き出せません。チャージしてください。");
		}
	}
	
	public static void main(String[] args) {
		BankAccount kimsDeposit = new BankAccount(10000, "金貞潤", 7406488);
		
		//残高表示
		System.out.println("現在の残高：" + kimsDeposit.getDepositBanlance() + "円");
		
		//口座名義
		System.out.println("あなたの口座番号："+kimsDeposit.DepositId);
		//入金
		kimsDeposit.deposit(20000);
		System.out.println("入金後残高 : "+kimsDeposit.getDepositBanlance()+"円");
		
		//引き出し
		kimsDeposit.widthraw(1000);
	}
}








