#include<stdio.h>
#include<ctype.h>

int main()
{
	int low=0; // variable to store whether the alphabet before is lowercase or not
	char s[250];
	printf("Enter the text\n");
	scanf("%[^\n]%*c",s);
	if(islower(s[0]))
	{
		low=1;
	}
	for(int i=1;s[i]!='\0';i++)
	{
		if(isalpha(s[i]))
		{
			if(low==1)
			{
				s[i]=toupper(s[i]);
				low=0;
			}
			else
			{
				s[i]=tolower(s[i]);
				low=1;
			}
		}
	}
	printf("The converted Sarcasm text is: %s\n",s);
	return 0;
}
