/*   Ported from: doc.src.linguist-manual.qdoc
<snip>
//! [0]
        HEADERS         = main-dlg.h \
                          options-dlg.h
        SOURCES         = main-dlg.cpp \
                          options-dlg.cpp \
                          main.cpp
        FORMS           = search-dlg.ui
        TRANSLATIONS    = superapp_dk.ts \
                          superapp_fi.ts \
                          superapp_no.ts \
                          superapp_se.ts
//! [0]


//! [1]
        CODECFORTR      = ISO-8859-5
//! [1]


//! [2]
        CODECFORSRC     = UTF-8
//! [2]


//! [3]
        label->setText(tr("F\374r \310lise"));
//! [3]


//! [4]
    Usage:
        lupdate [options] [project-file]
        lupdate [options] [source-file|path]... -ts ts-files
    Options:
        -help  Display this information and exit.
        -noobsolete
               Drop all obsolete strings.
        -extensions <ext>[,<ext>]...
               Process files with the given extensions only.
               The extension list must be separated with commas, not with whitespace.
               Default: 'ui,c,c++,cc,cpp,cxx,ch,h,h++,hh,hpp,hxx'.
        -silent
               Don't explain what is being done.
        -version
               Display the version of lupdate and exit.
//! [4]


//! [5]
        Usage:
            lrelease [options] project-file
            lrelease [options] ts-files [-qm qm-file]
        Options:
            -help  Display this information and exit
            -compress
                   Compress the .qm files
            -nounfinished
                   Do not include unfinished translations
            -silent
                   Don't explain what is being done
            -version
                   Display the version of lrelease and exit
//! [5]


//! [6]
        button = new QPushButton("&Quit", this);
//! [6]


//! [7]
        button = new QPushButton(tr("&Quit"), this);
//! [7]


//! [8]
            QPushButton::tr("&Quit")
//! [8]


//! [9]
            QObject::tr("&Quit")
//! [9]


//! [10]
           rbc = new QRadioButton(tr("Enabled", "Color frame"), this);
//! [10]


//! [11]
           rbh = new QRadioButton(tr("Enabled", "Hue frame"), this);
//! [11]


//! [12]
        /*
            TRANSLATOR FindDialog

            Choose Edit|Find from the menu bar or press Ctrl+F to pop up the
            Find dialog.

            ...
//! [12]


//! [13]
        /*
            TRANSLATOR MyNamespace::MyClass

            Necessary for lupdate.

            ...
//! [13]


//! [14]
        void some_global_function(LoginWidget *logwid)
        {
            QLabel *label = new QLabel(
                    LoginWidget::tr("Password:"), logwid);
        }

        void same_global_function(LoginWidget *logwid)
        {
            QLabel *label = new QLabel(
                    qApp->translate("LoginWidget", "Password:"),
                    logwid);
        }
//! [14]


//! [15]
        QString FriendlyConversation::greeting(int greet_type)
        {
            static const char* greeting_strings[] = {
                QT_TR_NOOP("Hello"),
                QT_TR_NOOP("Goodbye")
            };
            return tr(greeting_strings[greet_type]);
        }
//! [15]


//! [16]
        static const char* greeting_strings[] = {
            QT_TRANSLATE_NOOP("FriendlyConversation", "Hello"),
            QT_TRANSLATE_NOOP("FriendlyConversation", "Goodbye")
        };

        QString FriendlyConversation::greeting(int greet_type)
        {
            return tr(greeting_strings[greet_type]);
        }

        QString global_greeting(int greet_type)
        {
            return qApp->translate("FriendlyConversation",
                                    greeting_strings[greet_type]);
        }
//! [16]


</snip>
*/
import com.trolltech.qt.*;
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;
import com.trolltech.qt.xml.*;
import com.trolltech.qt.network.*;
import com.trolltech.qt.sql.*;
import com.trolltech.qt.svg.*;


public class doc_src_linguist-manual {
    public static void main(String args[]) {
        QApplication.initialize(args);
//! [0]
        HEADERS         = main-dlg.h \
                          options-dlg.h
        SOURCES         = main-dlg.cpp \
                          options-dlg.cpp \
                          main.cpp
        FORMS           = search-dlg.ui
        TRANSLATIONS    = superapp_dk.ts \
                          superapp_fi.ts \
                          superapp_no.ts \
                          superapp_se.ts
//! [0]


//! [1]
        CODECFORTR      = ISO-8859-5
//! [1]


//! [2]
        CODECFORSRC     = UTF-8
//! [2]


//! [3]
        label.setText(tr("F\374r \310lise"));
//! [3]


//! [4]
    Usage:
        lupdate [options] [project-file]
        lupdate [options] [source-file|path]... -ts ts-files
    Options:
        -help  Display this information and exit.
        -noobsolete
               Drop all obsolete strings.
        -extensions <ext>[,<ext>]...
               Process files with the given extensions only.
               The extension list must be separated with commas, not with whitespace.
               Default: 'ui,c,c++,cc,cpp,cxx,ch,h,h++,hh,hpp,hxx'.
        -silent
               Don't explain what is being done.
        -version
               Display the version of lupdate and exit.
//! [4]


//! [5]
        Usage:
            lrelease [options] project-file
            lrelease [options] ts-files [-qm qm-file]
        Options:
            -help  Display this information and exit
            -compress
                   Compress the .qm files
            -nounfinished
                   Do not include unfinished translations
            -silent
                   Don't explain what is being done
            -version
                   Display the version of lrelease and exit
//! [5]


//! [6]
        button = new QPushButton("uit", this);
//! [6]


//! [7]
        button = new QPushButton(tr("uit"), this);
//! [7]


//! [8]
            QPushButton.tr("uit")
//! [8]


//! [9]
            QObject.tr("uit")
//! [9]


//! [10]
           rbc = new QRadioButton(tr("Enabled", "Color frame"), this);
//! [10]


//! [11]
           rbh = new QRadioButton(tr("Enabled", "Hue frame"), this);
//! [11]


//! [12]
        /*
            TRANSLATOR FindDialog

            Choose Edit|Find from the menu bar or press Ctrl+F to pop up the
            Find dialog.

            ...
//! [12]


//! [13]
        /*
            TRANSLATOR MyNamespace.MyClass

            Necessary for lupdate.

            ...
//! [13]


//! [14]
        void some_global_function(LoginWidget ogwid)
        {
            QLabel abel = new QLabel(
                    LoginWidget.tr("Password:"), logwid);
        }

        void same_global_function(LoginWidget ogwid)
        {
            QLabel abel = new QLabel(
                    qApp.translate("LoginWidget", "Password:"),
                    logwid);
        }
//! [14]


//! [15]
        StringsFriendlyConversation.greeting(int greet_type)
        {
            static char* greeting_strings[] = {
                QT_TR_NOOP("Hello"),
                QT_TR_NOOP("Goodbye")
            };
            return tr(greeting_strings[greet_type]);
        }
//! [15]


//! [16]
        static char* greeting_strings[] = {
            QT_TRANSLATE_NOOP("FriendlyConversation", "Hello"),
            QT_TRANSLATE_NOOP("FriendlyConversation", "Goodbye")
        };

        StringsFriendlyConversation.greeting(int greet_type)
        {
            return tr(greeting_strings[greet_type]);
        }

        Stringsglobal_greeting(int greet_type)
        {
            return qApp.translate("FriendlyConversation",
                                    greeting_strings[greet_type]);
        }
//! [16]


    }
}